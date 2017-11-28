package deba.guru.springframework.spring5didemo.service;

public class GetterGreetingServiceImpl implements GreetingService{

	public static String GETTER_HELLO_GREETINGS = "Hello World !!!!!";

	@Override
	public String sayGreetings() {

		return GETTER_HELLO_GREETINGS;
	}
	
}
