package Shapes;

public class Layer extends Diagram{
	private int _number;
	Shape[] shape = new Shape[100];
	public Layer(int number){
		_number = number;
	}
	public void setNumber(int number){
		_number = number;
	}
	public int getNumber(){
		return _number;
	}
	public void removeTriangle(){
		
	}
	public void removeCircle(){
		
	}
}
