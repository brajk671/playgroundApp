package com.techelevator;

public class Automobile {
	
	
	    private int numberOfPassengers;
	    private int milesPerGallon;
	    private int gasTankCapacityInGallons;
	    private static int number = 42;
	    
	    public Automobile( ) {
	        numberOfPassengers = 5; 
	        milesPerGallon = 30;
	        gasTankCapacityInGallons = 15;
	    }
	   
	    
	    public Automobile( int numberOfPassengers, int milesPerGallon, int gasTankCapacityInGallons ) {
	        this.numberOfPassengers = numberOfPassengers;
	        this.milesPerGallon = milesPerGallon;
	        this.gasTankCapacityInGallons = gasTankCapacityInGallons;
	        number += numberOfPassengers; //adds to static number
 	    }
	    
	    
	    public int getTotalRangeInMiles( ) {
	        return gasTankCapacityInGallons * milesPerGallon;
	    }
	    
	    public void setNumber (int number) {
	    	this.number = number;
	    }
	    
	    public int getNumber () {
	    	return this.number;
	    }
}


