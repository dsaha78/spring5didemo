package deba.guru.springframework.spring5didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import deba.guru.springframework.spring5didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setup() {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();

	}

	@Test
	public void testSayHello() {
		assertEquals(GreetingServiceImpl.HELLO_GREETINGS, propertyInjectedController.sayHello());
	}

}
