
public class Triangle extends Shape{
	int side;
	
	public Triangle(int x, int y, int side)
	{
		super(x, y);
		this.side = side;
	}
	public void setSide(int side){
		this.side = side;
	}
	public int getSide(){
		return side;
	}
    @Override
	public void draw()
	{
		System.out.println("Draw triangle at (" + getX() + ", " + getY() + ")");
	}
}
