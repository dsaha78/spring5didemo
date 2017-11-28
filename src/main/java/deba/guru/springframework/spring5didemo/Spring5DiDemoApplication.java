package deba.guru.springframework.spring5didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import deba.guru.springframework.spring5didemo.controller.ConstructorInjectorController;
import deba.guru.springframework.spring5didemo.controller.MyController;
import deba.guru.springframework.spring5didemo.controller.PropertyInjectedController;

@SpringBootApplication
public class Spring5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);
		//MyController myController = (MyController)ctx.getBean("myController");
		//myController.hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		
		//System.out.println(ctx.getBean(ConstructorInjectorController.class).sayHello());
		
	}
}
