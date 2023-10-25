package com.picpay.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ConsumerController {

    @GetMapping
    public String teste(){
       return("Teste");
    }


}
