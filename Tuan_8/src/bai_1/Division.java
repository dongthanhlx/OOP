
public class Division extends BinaryExpression {
	private Expression left;
	private Expression right;
	public Division(){}
	public Division(Expression ex1, Expression ex2){
		this.left = ex1;
		this.right = ex2;
	}
	public void setExpression(Expression ex1, Expression ex2){
		this.left = ex1;
		this.right = ex2;
	}
	public void setLeft(Expression ex1){
		this.left = ex1;
	}
	public void setRight(Expression ex2){
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
		return "/";
	}
	public double evaluate() throws ArithmeticException{
		if(right().evaluate() == 0)	throw new ArithmeticException();
		return left().evaluate() / right().evaluate();
	}
}
