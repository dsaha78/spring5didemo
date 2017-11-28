package deba.guru.springframework.spring5didemo.controller;

import org.springframework.stereotype.Controller;

import deba.guru.springframework.spring5didemo.service.GreetingService;

@Controller
public class ConstructorInjectorController {
	
	private GreetingService greetingService;

	public ConstructorInjectorController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreetings();
	}
}