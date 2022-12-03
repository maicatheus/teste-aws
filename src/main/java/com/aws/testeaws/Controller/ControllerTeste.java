package com.aws.testeaws.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerTeste {

    @GetMapping()
    public ResponseEntity<String> teste(){
        return ResponseEntity.status(HttpStatus.OK).body("Request com sucesso!");
    }
}
