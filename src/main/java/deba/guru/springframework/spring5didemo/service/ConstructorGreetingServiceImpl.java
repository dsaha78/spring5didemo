package deba.guru.springframework.spring5didemo.service;

public class ConstructorGreetingServiceImpl implements GreetingService {

	public static String CONS_HELLO_GREETINGS = "Hello World !!!!!";

	@Override
	public String sayGreetings() {

		return CONS_HELLO_GREETINGS;
	}
	
}
