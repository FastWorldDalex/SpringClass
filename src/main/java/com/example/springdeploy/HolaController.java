package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @Value("${app.message}")
    String message;
    @GetMapping("/hola")
    public ResponseEntity<String> holaMundo(){
        System.out.println(message);
        return ResponseEntity.ok("Hola mundo");
    }
}
