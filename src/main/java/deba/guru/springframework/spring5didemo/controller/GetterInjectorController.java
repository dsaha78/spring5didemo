package deba.guru.springframework.spring5didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import deba.guru.springframework.spring5didemo.service.GreetingService;

@Controller
public class GetterInjectorController {

	@Autowired
	private GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreetings();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}