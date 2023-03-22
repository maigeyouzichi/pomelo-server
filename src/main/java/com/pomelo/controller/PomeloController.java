package com.pomelo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihao on 2023/3/19
 */
@RestController
@RequestMapping("/pomelo")
public class PomeloController {

    @GetMapping
    public String get() {
        return "Hello, Java !";
    }
}
