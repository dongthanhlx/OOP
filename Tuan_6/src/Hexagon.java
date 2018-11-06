
public class Hexagon extends Shape{
	private double edge;
	public Hexagon(int x,int y,int edge){
		super(x,y);
		this.edge = edge;
	}
	public void setEdge(int edge){
		this.edge = edge;
	}
	public double getEdge(){
		return edge;
	}
	public double Area(){
		return (3*Math.sqrt(3.0)*edge*edge)/2;
	}
	@Override
	public void draw(){
		System.out.println("Draw Hexegon at ("+getX()+","+getY()+")");
	}
}
