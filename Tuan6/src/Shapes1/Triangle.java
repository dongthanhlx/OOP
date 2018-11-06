package Shapes1;

import Shapes.Shape;

public class Triangle extends Shape{
	private double _height;
	public Triangle(String name,String color){
		super(name,color);
	}
	public void setHeight(double height){
		_height = height;
	}
	public double getHeight(){
		return _height;
	}
	@Override
	public double getArea(){
		return getWidth()*_height;
	}
}
