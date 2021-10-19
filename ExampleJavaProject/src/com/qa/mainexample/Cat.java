
package com.qa.mainexample;
 

public class Cat {
	
//		 First we need its attributes
		
		
		int age;
		boolean isHairShort = true;
		
		String hairColor = "Ginger";
		String favouriteFood;
		
//			Methods - CANS DOS
		
		public void scratches() {
			System.out.println("I scratch");
		}
		
		
		public int catDoesMath(int a, int b) {
			int z = a + b;
			System.out.println(z);
			return z;
		}
		
//		 Constructors
		
		public Cat() {
			
		}
		public Cat(int age, boolean isHairShort, String hairColor, String favouriteFood) {
			this.age = age;
			this.isHairShort = isHairShort;
			this.hairColor = hairColor; 
			this.favouriteFood = favouriteFood;
			
}	
	
		
}