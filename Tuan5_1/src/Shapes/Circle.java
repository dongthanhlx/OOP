package Shapes;

public class Circle {
	private static double _radius = 1.0 ;
	private String _color = "red";
	final static double PI=3.14;
	public Circle(){
	}
	public Circle(double radius){
		_radius = radius;
	}
	public static double getRadius(){
		return _radius;
	}
	public String getColor(){
		return _color;
	}
	public static double getArea(){
		return _radius*_radius*PI;
	}
	public String toString(){
		return _color;
	}
}
