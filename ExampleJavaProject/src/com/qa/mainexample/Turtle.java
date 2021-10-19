package com.qa.mainexample;

public class Turtle {

	int age;
	boolean isBig = true;
	String turtleColor = "Green";
	int weight = 100;
	int height = 2;
	

	public void greenMachine(){ 
		System.out.println("Green Machine"); 
	
	}
	
	public void weightHeight() {
		if (weight < 149) 
			System.out.println("lil big turtle");
		
		else if (weight > 150) 
			System.out.println("Big a** turtle");
	}
	
	public void weightHeight1() {
		if (height < 3)
			System.out.println ("shorty");
		else if (height > 3)
			System.out.println("Biggy");
	}

	
	
}	
	

