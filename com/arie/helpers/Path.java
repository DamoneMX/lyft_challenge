package com.arie.helpers;

public class Path {
	
	private Coordinate start;
	private Coordinate end;
	
	public Path(Coordinate coordinate1, Coordinate coordinate2){
		this.start  = coordinate1;
		this.end 	= coordinate2;
	}

	public Coordinate getStart() {
		return start;
	}
	
	public Coordinate getEnd() {
		return end;
	}

}
