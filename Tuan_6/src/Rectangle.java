
public class Rectangle extends Shape{
	int height;
	int width;
	
	public Rectangle(int x, int y, int height, int width)
	{
		super(x, y);
		this.height = height;
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}

        @Override
	public void draw(){
			System.out.println("Draw rectangle at (" + getX() + ", " + getY() + ")");
	}
    
}
