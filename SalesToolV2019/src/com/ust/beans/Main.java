package com.ust.beans;

public class Main {
	
	public static void main(String[] args) {
		
		SalesData sales=new SalesData();
		System.out.println("Welcome to sales App");
		displayGreetings();
		sales.display();
	}
	
	public static void displayGreetings()
	{
		System.out.println("Sales report 2019");
		System.out.println("Test1");
		System.out.println("Test3");

	}
	

}
