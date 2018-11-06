
public class Addition extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Addition(){}
	public Addition(Expression ex1, Expression ex2){
		this.left = ex1;
		this.right = ex2;
	}
	public void setExpression(Expression ex1, Expression ex2){
		this.left = ex1;
		this.right = ex2;
	}
	@Override
	public Expression left(){
		return left;
	}
	public Expression right(){
		return right;
	}
	public String toString(){
		return "+";
	}
	public double evaluate(){
		return left().evaluate() + right().evaluate();
	}
}
