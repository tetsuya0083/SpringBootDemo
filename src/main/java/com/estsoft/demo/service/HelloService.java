package com.estsoft.demo.service;


// Spring이 class의 객체를 알아서 관리해줌.
import org.springframework.stereotype.Service;

@Service // Spring에게 객체 관리를 맡김
public class HelloService {
    public String sayHello(){
        return "Hello Spring!";
    }
}
