
public class Layer {
	private boolean visible = true;
	Shape[] shapes = new Shape[100];
	Layer (){
		
	}
	Layer (Shape[] shapes,boolean visible)
	{
		setVisible(visible);
		if(this.visible)
		this.shapes = shapes;
	}
	Layer (Shape[] shapes){
		setVisible(visible);
		if(this.visible)	this.shapes = shapes;
	}
	public void setVisible(boolean t){
		visible = t;
	}
	public boolean getVisible(){
		return visible;
	}
	public int eraseTriangle(int n){
		for (int i = 0; i < n; i++)
		{
			if (shapes[i] instanceof Triangle){
				int j = i;
				while (j < n-1){
					shapes[j] = shapes[j+1];
					j++;
				}
				n--;
				i--;
			}
		}
		return n;
	}   
	public boolean testCircle(Shape a,Shape b){
		return (a.getX() == b.getX() && a.getY() == b.getY() && ((Circle)a).getRadius() == ((Circle)b).getRadius());
	}
	public boolean testRectangle(Shape a,Shape b){
		return a.getX() == b.getY() && a.getY() == b.getY() && ((Rectangle)a).getHeight() == ((Rectangle)b).getHeight() && ((Rectangle)a).getWidth() == ((Rectangle)b).getWidth();
	}
	public boolean testSquare(Shape a,Shape b){
		return a.getX() == b.getX() && a.getY() == b.getY() && ((Square)a).getEdge() == ((Square)b).getEdge();
	}
	public boolean testTriangle(Shape a,Shape b){
		return a.getX() == b.getX() && a.getY() == b.getY() && ((Triangle)a).getSide() == ((Triangle)b).getSide();
	}
	public boolean testHexagon(Shape a,Shape b){
		return a.getX() == b.getX() && a.getY() == b.getY() && ((Hexagon)a).getEdge() == ((Hexagon)b).getEdge();
	}
	public int process(Shape[] shapes,int n,int j){
		while(j<n-1){
			shapes[j] = shapes[j+1];
			j++;
		}
		n--;
		return n;
	}
	public int deleteDuplicate(){
		int n = shapes.length;
		int a,dem = 0;
		for(int i=0;i<n-1;i++){
			dem=0;
			for(int j=i+1;j<n;j++){
				if(shapes[i] instanceof Circle && shapes[j] instanceof Circle){
					if(testCircle(shapes[i],shapes[j]))	{
						n--;
						n=process(shapes,n,j);
						dem++;
					}
				}
				if(shapes[i] instanceof Rectangle && shapes[j] instanceof Rectangle){
					if(testRectangle(shapes[i],shapes[j])){
						n=process(shapes,n,j);
						dem++;
					}
				}
				if(shapes[i] instanceof Square && shapes[j] instanceof Square){
					if(testSquare(shapes[i],shapes[j])){
						n=process(shapes,n,j);
						dem++;
					}
				}
				if(shapes[i] instanceof Triangle && shapes[j] instanceof Triangle){
					if(testTriangle(shapes[i],shapes[j])){
						n=process(shapes,n,j);
						dem++;
					}
				}
				if(shapes[i] instanceof Hexagon && shapes[j] instanceof Hexagon){
					if(testHexagon(shapes[i],shapes[j])){
						n=process(shapes,n,j);
						dem++;
					}
				}
			}
			if(dem > 0){
				a=i;
				while(a<n-1){
					shapes[a] = shapes[a+1];
					a++;
				}
				n--;
			}
		}
		return n;
	}
	// DO Y 3 - TUAN 7 E CHUA HOANH THANH NEN E DE CMT
	public Layer[][] moveTo(Shape[] shapes){
		Layer[][]  layer = new Layer[4][10];
		Shape[][] shape1 = new Shape[4][10];
		int j=0,b=0,a=0,c=0,d=0;
		do{
					if(shapes[j] instanceof Circle) {
						shape1[0][a] = shapes[j];
						shape1[0][a] = shapes[j];
						a++;
					}
					if(shapes[j] instanceof Rectangle){
						shape1[1][b] = new Shape();
						shape1[1][b] = shapes[j];
						b++;
					}
					if(shapes[j] instanceof Square){
						shape1[2][c] = new Shape();
						shape1[2][c] = shapes[j];
						c++;
					}
					if(shapes[j] instanceof Triangle){
						shape1[3][d] = new Shape();
						shape1[3][d] = shapes[j];
						d++;
					}
					b++;
					j++;
		}while(j<shapes.length);
		for(int i=0; i<4; i++){
				for(j=0; j<shape1[i].length; j++)
					layer[i][j] = new Layer(shape1[i]);
		}
		return layer;
	}
	public void draw(int n){
		if(getVisible())
		for(int i=0;i<n; i++){
			System.out.println(shapes[i].getX()+"\t"+shapes[i].getY());
		}
	}
}
