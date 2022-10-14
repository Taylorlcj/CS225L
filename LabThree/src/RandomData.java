//***********************************************
// Class: RandomData
// Author: Keith Garfield
// Created: Jun 16, 2022
// Modfied: na
//
// Purpose: Create and manipulate random numbers
//
// **********************************************

public class RandomData {
	private double[] data;
	
    // create an array of size n
	public void createArray(int n) {
		data = new double[n];
	}
	
	// Populate the array with random values (initialize the array)
	public void initArray() {
		for (int i = 0; i < data.length; i++) {
			data[i] = Math.floor(  10000 * Math.random() );
		}
	}
	
	// Find the largest
	public double findMax() {
		double max = data[0];

		return 0;
	}
	
	// Find the smallest
	public double findMin() {
		double min = data[0];
		
		return min;
	}

	// Find how many are above some threshold value, t
	public int countAboveThreshold( double t )  {
		int count = 0;
		
		return count;
	}
	
	// Find the sum
	public double calculateSum() {
		double sum = 0;

		return sum;
	}
	
	// Find the average
	public double calculateAverage() {
		return calculateSum() / data.length;
	}
	
	// Sort the array from smallest to largest
	public void sortData() {
		double temp;
		
		for (int i =0; i < data.length; i++) {
			for ( int j = 0; j < data.length - 1; j++ ) {
				if ( data[j] > data[j+1] ) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
       
	// Print out the array
	public void printArray() {
		for (int i = 0; i < data.length ; i++ ) {
			System.out.println("Element " + i + " = " + data[i]);
		}
	}

	
}