package com.dillon.Vehicle;

//Extends allows parent class to be used in the child class

public class Bikes extends Vehicles {
	
	// Child Class Cars has its own Fields
	
		// Fields
		
		private String Type;
		private boolean OnRoad;
		private int NumWheels;
		
		
		//Getters and Setters
		
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public boolean isOnRoad() {
			return OnRoad;
		}
		public void setOnRoad(boolean onRoad) {
			OnRoad = onRoad;
		}
		public int getNumWheels() {
			return NumWheels;
		}
		public void setNumWheels(int numWheels) {
			NumWheels = numWheels;
		}
		
		// Constructors
		
		public Bikes(String make, String model, int year, String reg, int cost, String type, boolean onRoad,
				int numWheels) {
			super(make, model, year, reg, cost);
			Type = type;
			OnRoad = onRoad;
			NumWheels = numWheels;
		}
		
		
		
			
		
		

}
