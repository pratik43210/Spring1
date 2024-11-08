package com.pratik.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import java.beans.ConstructorProperties;
@Component
public class Alien {
	
	@Value("25")
	private int age;
	
//	@Autowired//adding autowire here is field injection
//	@Qualifier("laptop") bean name will be class name in small letters
//	@Qualifier("com2")
	private Computer com;
	//we nned getter and setter for injection of comtop object
	public Computer getCom() {
		return com;
	}
	@Autowired//setter injection
	@Qualifier("laptop")//prioritized over primary
	public void setCom(Computer com) {
		this.com = com;
	}
	public Alien() {
		System.out.println("Alien Object Created");
	}
//	we need to add this if we are using name in constructor-arg
//	this will ensure we don't get error when we are not following
//	the sequence of arguments
//	@ConstructorProperties({"age","com"})
//	public Alien(int age, Computer com) {
//		super();
//		this.age = age;
//		this.com = com;
//		System.out.println("para constructor called");
//	}
//	
	public void code() {
		System.out.println("Coding");
		com.complie();
	}
	public void setAge(int age) {
		System.out.println("Setter called");
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
