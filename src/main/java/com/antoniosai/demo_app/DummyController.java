package com.antoniosai.demo_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class DummyController {

    @Value("${value.message}")
    private String greeting;

    @GetMapping
    public String sayHello() {
        return greeting;
    }
}
