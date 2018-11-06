
public class Circle extends Shape{
	public int radius;
	
	public Circle(int x, int y, int radius){
		super(x, y);
		this.radius = radius;
	}
	
    @Override
	public void draw(){
		System.out.println("Draw circle at (" + getX() + ", " + getY() + ")");
	}
    public void erase(){
                System.out.println("Erase circle at("+ getX() + ", " + getY() + ")");
    }
    public void setRadius(int radius){
    	this.radius = radius;
    }
    public int getRadius(){
    	return radius;
    }
}
