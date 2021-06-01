package br.com.dev.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String hello(){
        return String.format("Hey everyone, hello!");
    }

    @GetMapping(value = "/{nome}")
    public String hello(@PathVariable("nome") String nome){
        return String.format("Hey %s, hello!", nome);
    }
}
