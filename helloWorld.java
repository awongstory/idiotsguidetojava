package com.truthmd.aliciaspringboot.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class HelloWorldService {
    public String hello() {
        return "Hello World!";
    }
}
