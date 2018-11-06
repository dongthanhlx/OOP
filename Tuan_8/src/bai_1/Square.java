
public class Square extends Expression{
	private Expression expression;
	public Square(){}
	public Square(Expression ex){
		this.expression = ex;
	}
	public void setExpression(Expression ex){
		this.expression = ex;
	}
	public Expression getExpression(){
		return expression;
	}
	@Override
	public String toString(){
		return "^2";
	}
	@Override
	public double evaluate(){
		return getExpression().evaluate()*getExpression().evaluate();
	}
	
}
