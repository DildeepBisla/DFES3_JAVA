package com.dillon.Vehicle;

//Extends allows parent class to be used in the child class 

public class Cars extends Vehicles {
	
		// Child Class Cars has its own Fields
		
		// Fields
		private String Color;
		private int Topseed;
		private int C02Ems;
		
		
		// Child Class Method
		
		public int roadTax() {
			return C02Ems / (30 * 100); 
		}


		// Getters and Setters
		
		public String getColor() {
			return Color;
		}


		public void setColor(String color) {
			Color = color;
		}


		public int getTopseed() {
			return Topseed;
		}


		public void setTopseed(int topseed) {
			Topseed = topseed;
		}


		public int getC02Ems() {
			return C02Ems;
		}


		public void setC02Ems(int c02Ems) {
			C02Ems = c02Ems;
		}


		// Constructor
		
		public Cars(String make, String model, int year, String reg, int cost, String color, int topseed, int c02Ems) {
			super(make, model, year, reg, cost);
			Color = color;
			Topseed = topseed;
			C02Ems = c02Ems;
		}


		
		
		
		
		
		
		

}
