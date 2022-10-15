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
	
	public static void main(String[] args) {
		//Parameters for truck 1
		int truck1Capacity = 30;
		int truck1FuelBurn = 50;
		int truck1Cost = 10000;
		int truck1total = totalCost(truck1Capacity,truck1Cost,truck1FuelBurn);
		System.out.println("Truck 1 total cost: $" + truck1total);

		//Parameters for truck 2
		int truck2Capacity = 40;
		int truck2FuelBurn = 70;
		int truck2Cost = 13000;
		int truck2total = totalCost(truck2Capacity,truck2Cost,truck2FuelBurn);
		System.out.println("Truck 2 total cost: $" + truck2total);

		//Parameters for truck 3
		int truck3Capacity = 80;
		int truck3FuelBurn = 100;
		int truck3Cost = 20000;
		int truck3total = totalCost(truck3Capacity,truck3Cost,truck3FuelBurn);
		System.out.println("Truck 3 total cost: $" + truck3total);
		
		//using if else and the totalCosts function find and return the best truck
		if (truck1total < truck2total && truck1total <truck3total){
			System.out.println("Truck 1 is the best!");
		}
		else if (truck2total < truck1total && truck2total <truck3total){
			System.out.println("Truck 2 is the best!");
		}
		else{
			System.out.println("Truck 3 is the best!");
		}
	}
	
	public static int totalCost(int capacity, int fuelBurn, int vehicleCost) {
		
		return vehicleCost + fuelCosts(fuelBurn, numTrips(capacity));
	}
	
	public static int fuelCosts(int fuelBurn, int numTrips) {
		//calculate fuel costs here 
		return fuelBurn  * numTrips  * 5;
	}
	
	public static int numTrips(int capacity) {
		//calculate number of trips here
		return 120 / capacity;
	}

}


