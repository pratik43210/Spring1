package com.pratik.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public Laptop() {
		System.out.println("Laptop object created");
	}
	
	@Override
	public void complie() {
		System.out.println("Compiling using Laptop");
	}
}
