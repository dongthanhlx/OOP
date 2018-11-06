package Shapes;

public class Cylinder extends Circle{
	private static double _height = 1.0;
	public Cylinder(){
		
	}
	public Cylinder(double radius){
		super(radius);
	}
	public Cylinder(double radius,double height){
		super(radius);
		_height=height;
	}
	public double getHeight(){
		return _height;
	}
	public double getVolume(){
		return Circle.getArea()*_height;
	}
	public static double getArea(){
		return 2*PI*getRadius()*_height + 2*PI*getRadius()*getRadius();
	}
	@Override
	public String toString(){
		return getColor();
	}
}
