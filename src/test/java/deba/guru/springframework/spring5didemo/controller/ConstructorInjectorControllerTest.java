package deba.guru.springframework.spring5didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import deba.guru.springframework.spring5didemo.service.GreetingServiceImpl;

public class ConstructorInjectorControllerTest {
	private ConstructorInjectorController constructorInjectorController;

	@Before
	public void setup() {
		this.constructorInjectorController = new ConstructorInjectorController(new GreetingServiceImpl());
	}

	@Test
	public void testSayHello() {
		assertEquals(GreetingServiceImpl.HELLO_GREETINGS, constructorInjectorController.sayHello());
	}

}
