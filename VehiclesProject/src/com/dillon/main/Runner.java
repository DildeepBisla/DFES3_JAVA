package com.dillon.main;

import com.dillon.GarageArrayList.Garage;
import com.dillon.Vehicle.Bikes;
import com.dillon.Vehicle.Boats;
import com.dillon.Vehicle.Cars;

public class Runner {

	public static void main(String[] args) {
		
						
		Cars Car1 = new Cars("BMW", "1 Series", 2017, "YK13TSS", 25000, "Blue", 170, 230);
		Garage.addVehicles(Car1);
//		System.out.println(Car1.fixVehicle());
		
		
		Bikes Bike1 = new Bikes("KTM", "125 Duke", 2002, "YK02TST", 2500, "Motor", true, 2);
		Garage.addVehicles(Bike1);
//		System.out.println(Bike1.fixVehicle());
		
		Boats Boat1 = new Boats("Princess", "40 FlyBridge", 2015, "YK15DSD", 95000, "The Biggy", 85, "Quayside");
		Garage.addVehicles(Boat1);
//		System.out.println(Boat1.fixVehicle());
		
		
		Garage.displayVehicles();
//		Garage.removeVehicles(1);
//		Garage.displayVehicles();
		
//		Garage.updateVehicles(0);
//		Garage.displayVehicles();
		
		Garage.fixMethod();
		
	}	
}
