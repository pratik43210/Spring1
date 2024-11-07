package com.pratik.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//name the bean
@Component("com2")
@Primary// we can use instead of qualifier
public class Desktop implements Computer {
	public Desktop() {
		System.out.println("Destop object created");
	}
	@Override
	public void complie() {
		System.out.println("Compiling using Desktop");
	}
}
