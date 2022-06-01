package com.advance.ass;

public class Testperi {
	public static void main(String[] args) {
		RectPerimeter r1=new RectPerimeter(12.2,3.5);
		RectPerimeter r2=new RectPerimeter(4.5,7.5);
		RectPerimeter r3=new RectPerimeter(17.2, 9.5);
		r1.perimeter();
		r1.printArea();
		r2.perimeter();
		r2.printArea();
		r3.perimeter();
		r3.printArea();
	}
}
