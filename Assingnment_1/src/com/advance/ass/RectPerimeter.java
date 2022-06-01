package com.advance.ass;

public class RectPerimeter {

	private double length;
	
	private double breadth;
	
	
	public RectPerimeter(double d, double e) {
		super();
		this.length = d;
		this.breadth = e;
	}

	public double getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public void perimeter() {
		double peri=2*(length+breadth);
		System.out.println("perimeter of rectangle is: "+peri);
		
	}
	
	public void printArea() {
		System.out.println("Length- " + length + " Breadth- " +breadth);

		double area=(length*breadth);
		System.out.println("Area of rectangle "+area);
			}

}
