// *************************************
// Class: CostCalculator
// Author: Taylor Jensen
// Created: Oct 14, 2022
// Modfied: na
//
// Purpose: Calculates costs of truck trips
//
// ********************************************** 
public class CostCalculator {
	
	public static void main(String args) {
		//Parameters for truck 1
		int truck1Capacity = 30;
		int truck1FuelBurn = 50;
		int truck1Cost = 10000;
		
		//using if else and the totalCosts function find and return the best truck
		
	}
	
	public static int totalCost(int capacity, int fuelBurn, int vehicleCost) {
		
		return vehicleCost + fuelCosts(fuelBurn, numTrips(capacity));
	}
	
	public static int fuelCosts(int fuelBurn, int numTrips) {
		//calculate fuel costs here 
		return 0;
	}
	
	public static int numTrips(int capacity) {
		//calculate number of trips here
		return 0;
	}

}


