package com.arie.main;

import com.arie.helpers.Coordinate;
import com.arie.helpers.Geographical;
import com.arie.helpers.Path;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetourCalculator {

	public static double calculateDetourDistance(Path path1, Path path2) {
		if(path1 == null && path2 == null) {
			return 0;
		}
		
		double ABdistance = Geographical.calculateDistance(path1.getStart(), path1.getEnd());
		double CDdistance = Geographical.calculateDistance(path2.getStart(), path2.getEnd());
		
		//calculate detour distance for Driver1 (Path1) 
		//A->C->D->B - (A->B)
		double length1 = Geographical.calculateDistance(path1.getStart(), path2.getStart());
		length1 += CDdistance;
		length1 += Geographical.calculateDistance(path2.getEnd(), path2.getEnd());
		length1 -= ABdistance;
		
		//calculate detour distance for Driver2 (Path2)
		//C->A->B->D - (C->D)
		double length2 = Geographical.calculateDistance(path2.getStart(), path1.getStart());
		length2 += ABdistance;
		length2 += Geographical.calculateDistance(path1.getEnd(), path2.getEnd());
		length2 -= CDdistance;
		
		return Math.min(length1, length2);
	}
	
	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter latitude for point A:");
			double p1lat = input.nextDouble();
			System.out.println("Enter longitude for point A:");
			double p1long = input.nextDouble();
			Coordinate pointA = new Coordinate(p1lat, p1long);
			System.out.println("Enter latitude for point B:");
			double p2lat = input.nextDouble();
			System.out.println("Enter longitude for point B:");
			double p2long = input.nextDouble();
			Coordinate pointB = new Coordinate(p2lat, p2long);
			
			Path path1 = new Path(pointA, pointB);
			
			System.out.println("Enter latitude for point C:");
			double p3lat = input.nextDouble();
			System.out.println("Enter longitude for point C:");
			double p3long = input.nextDouble();
			Coordinate pointC = new Coordinate(p3lat, p3long);
			System.out.println("Enter latitude for point D:");
			double p4lat = input.nextDouble();
			System.out.println("Enter longitude for point D:");
			double p4long = input.nextDouble();
			Coordinate pointD = new Coordinate(p4lat, p4long);
			Path path2 = new Path(pointC, pointD);

			System.out.println("The length of the shortest detour distance is:");
			System.out.println(calculateDetourDistance(path1, path2) + " miles");
		} catch(InputMismatchException e) {
			System.out.println("Incorrect Input.");
			System.err.println("InputMismatchException: " + e.getMessage());
		} 
	}
	
}
