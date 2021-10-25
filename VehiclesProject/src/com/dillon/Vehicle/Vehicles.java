package com.dillon.Vehicle;

public class Vehicles {
	
	// Base Class (Parent Class)

			
			// Fields
			private String Make;
			private String Model;
			private int Year;
			private String Reg;
			private int Cost;
			
			// Fixed Vehicle Method
			// Depreciated Current Value
			public int fixVehicle() {	
				if (2021 == Year) {
					return Cost;
				}
				else {	
					return Cost / (2021 - Year);
				}
				
			}
			
						
			// Getters and Setters
			public String getMake() {
				return Make;
			}
			public void setMake(String make) {
				Make = make;
			}
			public String getModel() {
				return Model;
			}
			public void setModel(String model) {
				Model = model;
			}
			public int getYear() {
				return Year;
			}
			public void setYear(int year) {
				Year = year;
			}
			public String getReg() {
				return Reg;
			}
			public void setReg(String reg) {
				Reg = reg;
			}
			
			public int getCost() {
				return Cost;
			}
			public void setCost(int cost) {
				Cost = cost;
			}

			// Constructor
			
			public Vehicles(String make, String model, int year, String reg, int cost) {
				super();
				Make = make;
				Model = model;
				Year = year;
				Reg = reg;
				Cost = cost;
			}


			@Override
			public String toString() {
				return "Vehicles [Make=" + Make + ", Model=" + Model + ", Year=" + Year + ", Reg=" + Reg + ", Cost="
						+ Cost + "]";
			}


			
		
			
			
}			
			 
		