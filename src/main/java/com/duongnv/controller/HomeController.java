package com.duongnv.controller;

import com.duongnv.dto.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/api")
    public Student student() {
        return new Student("Nguyen Van Duong", 20);
    }
}
