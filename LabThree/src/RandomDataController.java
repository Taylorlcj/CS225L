// *************************************
// Class: RandomDataManager
// Author: Taylor Jensen
// Created: Oct 16, 2022
// Modified: na
//
// Purpose: Creates a RandomData object and manages it
//
// ********************************************** 

public class RandomDataController {
	
	public static void main( String[] args) {
		RandomData rData = new RandomData();
		
		rData.createArray(500);
		rData.initArray();
		
		System.out.println("The sum of the numbers is " +  rData.calculateSum() );
		System.out.println("The average value is " + rData.calculateAverage()  );
		System.out.println("The largest values is " + rData.findMax() );
		System.out.println("The smallest value is " + rData.findMin());
		System.out.println("The number of data elements greater than 6000 is " + rData.countAboveThreshold( 6000.0 ) );
		rData.sortData();
		rData.printArray();


		}
}