package Shapes;

public class Shape extends Layer{
	private String _color,_name;
	private double _width;
	private double _x,_y;
	public Shape(String name){
		_name = name;
	}
	public Shape(String name,String color){
		this(name);
		_color = color;
	}
	public void setColor(String color){
		_color = color;
	}
	public String getColor(){
		return _color;
	}
	public void setName(String name){
		_name = name;
	}
	public String getName(){
		return _name;
	}
	public void setWidth(double width){
		_width = width;
	}
	public double getWidth(){
		return _width;
	}
	public double getArea(){
		return 0;
	}
	public void setCoordinates(double x,double y){
		_x = x;
		_y = y;
	}
	public double getX(){
		return _x;
	}
	public double getY(){
		return _y;
	}
}
