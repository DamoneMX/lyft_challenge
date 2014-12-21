package com.arie.helpers;

public class Coordinate {

	private double latitude;
	private double longitude;
	
	public Coordinate(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double latitudeToRadians(){
		return Math.toRadians(latitude);
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double longitudeToRadians(){
		return Math.toRadians(longitude);
	}
}
