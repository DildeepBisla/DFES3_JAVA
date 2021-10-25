package com.dillon.Vehicle;

//Extends allows parent class to be used in the child class

public class Boats extends Vehicles {
	
	// Child Class Cars has its own Fields
	
		// Fields
		
		private String Name;
		private int SpeedInKnots;
		private String Dock;
		
		//Getters and Setters
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getSpeedInKnots() {
			return SpeedInKnots;
		}
		public void setSpeedInKnots(int speedInKnots) {
			SpeedInKnots = speedInKnots;
		}
		public String getDock() {
			return Dock;
		}
		public void setDock(String dock) {
			Dock = dock;
		}
		
		// Constructor
		
		public Boats(String make, String model, int year, String reg, int cost, String name, int speedInKnots,
				String dock) {
			super(make, model, year, reg, cost);
			Name = name;
			SpeedInKnots = speedInKnots;
			Dock = dock;
		}
		
		
		
		
		
		
		
		
		

}
