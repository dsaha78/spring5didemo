package deba.guru.springframework.spring5didemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import deba.guru.springframework.spring5didemo.service.GreetingServiceImpl;

public class GetterInjectorControllerTest {
	private GetterInjectorController getterInjectedController;

	@Before
	public void setup() {
		this.getterInjectedController = new GetterInjectorController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());

	}

	@Test
	public void testSayHello() {
		assertEquals(GreetingServiceImpl.HELLO_GREETINGS, getterInjectedController.sayHello());
	}

}
