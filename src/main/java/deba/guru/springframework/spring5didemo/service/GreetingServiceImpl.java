package deba.guru.springframework.spring5didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static String HEELO_GREETINGS = "Hello World !!!!!";

	@Override
	public String sayGreetings() {

		return HEELO_GREETINGS;
	}

}
