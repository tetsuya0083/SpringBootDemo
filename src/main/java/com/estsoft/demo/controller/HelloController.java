package com.estsoft.demo.controller;

import com.estsoft.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequiredArgsConstructor // lombok 생성자 자동 생성
@RestController
public class HelloController {

    @Autowired // Dependency Injection
    private final HelloService helloService;

    public HelloController(HelloService helloService/* 의존성 주입 Dependency Injection*/) {
        //this.helloService = new HelloService(); // 일반적인 흐름, 제어
        this.helloService = helloService; // 제어의 역전(IoC)
    }
    // HelloService helloService = new HelloService();

    @GetMapping("/hello")
    public String hello(){
        // service method call

        return helloService.sayHello();
    }
}
