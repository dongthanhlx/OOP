
public class TestDiagram {
	public static int n;
	public static void main(String[] args){
		Shape[] shapeList = new Shape[10];
		
		shapeList[0] = new Triangle(1, 5, 7);
		shapeList[1] = new Circle(2, 4, 5);
		shapeList[2] = new Rectangle(1, 5,7 ,9);
		shapeList[3] = new Square(7, 3, 4);
		shapeList[4] = new Triangle(1, 3, 4);
		shapeList[5] = new Triangle(4, 6, 9);
		shapeList[6] = new Triangle(1, 3, 4);
		shapeList[7] = new Circle(2, 4, 5);
		shapeList[8] = new Circle(2, 4, 5);
		shapeList[9] = new Triangle(1, 5, 7);
		n = shapeList.length;
		Layer layer1 = new Layer(shapeList,false);
		layer1.draw(n);
		System.out.println();
		n=layer1.eraseTriangle(n);
		layer1.draw(n);
        System.out.println();
        Diagram diagram1 = new Diagram(shapeList);
        n = diagram1.eraseCircle(n);
        diagram1.draw(n);
        System.out.println();
        layer1.draw(n);
		/*Layer[][] layer = new Layer[4][100];
        layer = layer1.moveTo(shapeList);
        for(int i=0; i<layer.length; i++){
        	layer[i][100].draw(layer[i].length);
        }*/
	}
}
