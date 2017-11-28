package deba.guru.springframework.spring5didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService { 

	public static String GETTER_HELLO_GREETINGS = "Hello World !!!!!";

	@Override
	public String sayGreetings() {

		return GETTER_HELLO_GREETINGS;
	}
	
}
