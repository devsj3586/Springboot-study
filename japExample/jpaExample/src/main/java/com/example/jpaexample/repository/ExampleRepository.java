package com.example.jpaexample.repository;

import com.example.jpaexample.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
    //인터페이스extendsJpaRepository <엔티티파일명, pk 타입>  repo sms 끝

    // WHERE절 메서드명에따라 쿼리 정해짐
    public List<Example> findByName(String name);   // where name = ?

    public List<Example> findByNameStartingWith(String name);   // where name like 'x%' = ?

    public List<Example> findByPriceLessThan(int price); // where price < x = ? PriceLessThan 이하

    public List<Example> findByNameAndPrice(String name, int price);  // where name = ? , ane price = ?



}
