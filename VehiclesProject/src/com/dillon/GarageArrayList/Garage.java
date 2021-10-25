package com.dillon.GarageArrayList;

import java.util.ArrayList;

import com.dillon.Vehicle.Vehicles;

public class Garage {
	
	public static ArrayList<Vehicles> GarageList = new ArrayList<Vehicles>( );
	
		
	public static void addVehicles(Vehicles vehicles) {
		GarageList.add(vehicles);
					
	}
	
	
	public static void removeVehicles(int index) {
		
		GarageList.remove(index);
		
	}
	
	
	public static void updateVehicles(int index) {
	
		GarageList.set(index, null);
		
	}
	
	public static void displayVehicles() {
		
		for(Vehicles vehicles : GarageList) {
			System.out.println(vehicles);
		}
		
	}

	public static void clearAllVehicles() {
		
		GarageList.removeAll(GarageList);
		
	}
	
	public static void fixMethod() {
		
		for(Vehicles vehicles : GarageList) {
			System.out.println(vehicles.fixVehicle());
		
		}
		
	}
	
	
	
	
//	public static void displayArrayList () {
		
//		for (int i = 0; i< vehicles.size(); i++ ) {
//			System.out.println(vehicles.get(i));
//		}
//	}
		
	
	
	
		
	
		
	

}
