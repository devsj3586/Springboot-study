package com.example.jpaexample.service;

import com.example.jpaexample.dto.ExampleReqDTO;
import com.example.jpaexample.dto.ExampleResDTO;
import com.example.jpaexample.entity.Example;
import com.example.jpaexample.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExampleService {

    @Autowired
    ExampleRepository repo;

    //JAP insert 문
    public ExampleResDTO merge(ExampleReqDTO req) { // 메서드명 merge(경합)
        Example ex = req.toEntity();
        ex = repo.save(ex); // pk(PRIMARY KEY) 가 있으면 업데이트 , 없으면 insert
        return new ExampleResDTO(ex.getName());
    }

    // select
    public List<ExampleResDTO> selectAll() {   // stream  AIP 많이 사용.

        List<Example> result = repo.findAll();

        List<ExampleResDTO> resList = result.stream()   // for 문이 많으면 직관적으로 알기 힘듬 stream 사용
                .map(ex -> new ExampleResDTO(ex.getName())) //map : example entity 를  변환
                .collect(Collectors.toList());      //collect 변활할때쓰는것   list로 변경해 반환

        return resList;
    }

    public ExampleResDTO selectOne(ExampleReqDTO req) {
        // findById == pk
        Example res = repo.findById(req.getId()).orElse(null);
        // Optional 형변환 문제  orElse 예외시 어떻게 처리할건지 넣음
        return new ExampleResDTO(res.getName());
    }

    public void deleteOne(ExampleReqDTO req) {
        repo.deleteById(req.getId());
    }

    public void deleteAll() {
        repo.deleteAll();   // jpa 메서드
    }

    public List<ExampleResDTO> selectByName(ExampleReqDTO dto) {

        List<Example> result = repo.findByName(dto.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByNameStartingWith(ExampleReqDTO dto) {

        List<Example> result = repo.findByNameStartingWith(dto.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByPriceLessThan(ExampleReqDTO dto) {

        List<Example> result = repo.findByPriceLessThan(dto.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> findByNameAndPrice(ExampleReqDTO dto) {

        List<Example> result = repo.findByNameAndPrice(dto.getName(), dto.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(ex -> new ExampleResDTO(ex.getName()))
                .collect(Collectors.toList());

        return resList;
    }

}
