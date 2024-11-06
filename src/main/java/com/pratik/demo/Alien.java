package com.pratik.demo;

public class Alien {
	private int age;
	private Laptop lap;
	//we nned getter and setter for injection of Laptop object
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public Alien(int age, Laptop lap) {
		super();
		this.age = age;
		this.lap = lap;
		System.out.println("para constructor called");
	}
	
	public void code() {
		System.out.println("Coding");
		lap.complie();
	}
	public void setAge(int age) {
		System.out.println("Setter called");
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
