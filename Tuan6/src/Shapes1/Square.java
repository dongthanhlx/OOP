package Shapes1;

import Shapes.Shape;

public class Square extends Shape{
	public Square(String name,String color){
		super(name,color);
	}
	@Override
	public double getArea(){
		return getWidth()*getWidth();
	}
}
