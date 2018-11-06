
public class Diagram {
	Layer[] layers = new Layer[100];
	Shape[] shapes = new Shape[100];
    Diagram(Shape[] shapes){
            this.shapes = shapes;
    }
	Diagram(Layer[] layers)
	{
		this.layers = layers;
	}
    public int eraseCircle(int m){
		for (int i = 0; i < m; i++){
			if (shapes[i] instanceof Circle){
				int j = i;
				while (j < m-1 && j >= 0){
					shapes[j] = shapes[j+1];
					j++;
				}
				m--;
				i--;
			}
		}
		return m;
	}
    public void draw(int n){
		for(int i=0;i<n; i++){
			System.out.println(shapes[i].getX()+"\t"+shapes[i].getY());
		}
	}
}
