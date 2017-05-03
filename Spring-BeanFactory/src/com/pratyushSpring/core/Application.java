package com.pratyushSpring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Greetings greetings = (Greetings) factory.getBean("greetings");
		System.out.println(greetings.getMessage());
	}
}
