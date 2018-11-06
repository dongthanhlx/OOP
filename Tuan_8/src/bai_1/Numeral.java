
public class Numeral extends Expression{
	private double value;
	public Numeral(){}
	public Numeral(int value){
		this.value = value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public double getValue(){
		return value;
	}
	@Override
	public double evaluate(){
		return getValue();
	}
	public String toString(){
		return "";
	}
}
