package Shapes1;

import Shapes.Shape;

public class Circle extends Shape{
	final double PI = 3.14;
	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Circle(String name,String color){
		super(name,color);
	}
	@Override
	public double getArea(){
		return getWidth()*getWidth()*PI;
	}
}
