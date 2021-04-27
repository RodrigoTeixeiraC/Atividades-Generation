package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/habilidades")
public class helloHabilidadesController {

	@GetMapping
	public String habilidades() {
		return "Hello Word!\nA mentalidade de persistencia foi utilizada com sucesso!";
	}
	
}
