package deba.guru.springframework.spring5didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import deba.guru.springframework.spring5didemo.service.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayGreetings();
	}
}
