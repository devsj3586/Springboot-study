package com.example.demo1.calender.contoller;

import com.example.demo1.dto.Calender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class CalenderController {

    // ArrayList 생성, Calender(DTO)를 List 로 받는 calList
    private ArrayList<Calender> calList = new ArrayList<>();

    @GetMapping("/all/schedule")
    public ArrayList<Calender> allSchedule() {

        return calList;
    }

    @GetMapping("/put/schedule")
    public ArrayList<Calender> putSchedule(Calender cal) {
        boolean flag = true;
        for (int i = 0; i < calList.size(); i++) {
            if (calList.get(i).getDate().equals(cal.getDate())) {
                calList.set(i, cal);
                System.out.println("calList = " + calList);
                flag = false;
            }
        }
        if (flag)
            calList.add(cal);

        return calList;
    }

}