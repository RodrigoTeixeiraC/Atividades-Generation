package com.helloword.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aprendizagem")
public class helloAprendizagemController {
	
	@GetMapping
	public String aprendizagem() {
		return "Hello Word!\nNessa semana iremos aprender Spring Boot e Hibernate";
	}

}
