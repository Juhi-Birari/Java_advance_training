package com.advance.ass;

public class Rectangle {
	 private double length;
	 private double breadth;
	
	public Rectangle(double length, double breadth) {
		
		this.length =  length;
		this.breadth = breadth;
	}
	
	public void printArea() {
		System.out.println("Length- " + length + " Breadth- " +breadth);

		double area=(length*breadth);
		System.out.println("Area of rectangle "+area);
			}
	

}
