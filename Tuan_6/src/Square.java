
public class Square extends Shape{
	int edge;
	
	public Square(int x, int y, int edge)
	{
		super(x, y);
		this.edge = edge;
	}
	public void setEdge(int edge){
		this.edge = edge;
	}
	public int getEdge(){
		return edge;
	}
	
        @Override
	public void draw()
	{
		System.out.println("Draw square at (" + getX() + ", " + getY() + ")");
	}
}
