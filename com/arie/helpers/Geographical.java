package com.arie.helpers;

public class Geographical {
	
	/**
     * Calculate distance between 2 points using Haversine formula.
     */
	public static double calculateDistance(Coordinate coordinate1, Coordinate coordinate2) {
		
		double distance1 = Math.toRadians(coordinate2.getLatitude() - coordinate1.getLatitude());
        double distance2 = Math.toRadians(coordinate2.getLongitude() - coordinate1.getLongitude());

        double c = 2 * Math.asin(
        		Math.sqrt(Math.sin(distance1 / 2) 
        		* Math.sin(distance1 / 2) 
        		+ Math.sin(distance2 / 2) 
        		* Math.sin(distance2 / 2) 
        		* Math.cos(coordinate1.latitudeToRadians()) 
        		* Math.cos(coordinate2.latitudeToRadians()))
        		);
        
        //We want to obtain result in miles
        return 3961 * c;
	}
	
}
