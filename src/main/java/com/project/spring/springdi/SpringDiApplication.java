package com.project.spring.springdi;

import com.project.spring.springdi.controllers.ConstructorInjectedController;
import com.project.spring.springdi.controllers.MyController;
import com.project.spring.springdi.controllers.PropertyInjectedController;
import com.project.spring.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ConcurrentModificationException;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greet = myController.sayHello();

		System.out.println(greet);

		System.out.println("------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
