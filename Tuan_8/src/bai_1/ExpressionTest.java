

public class ExpressionTest {
	public static int save = -1;
	public static int result = 0;
	public static void TableChoose(){
		System.out.println("2. Square");
		System.out.println("3. Addition");
		System.out.println("4. Subtraction");
		System.out.println("5. Multiplication");
		System.out.println("6. Division");
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Numeral number3 = new Numeral();
		Numeral number10 = new Numeral();
		Numeral number2 = new Numeral();
		Numeral number1 = new Numeral();
		Numeral number0 = new Numeral();
		
		Square square = new Square();
		Square square1 = new Square();
		Subtraction sub = new Subtraction();
		Multiplication mul = new Multiplication();
		Addition add = new Addition();
		Division div = new Division();
		number0.setValue(0);
		number1.setValue(1);
		number2.setValue(2);
		number3.setValue(3);
		number10.setValue(10);
		square.setExpression(number10);
		sub.setExpression(square, number1);
		mul.setExpression(number2, number3);
		add.setExpression(sub, mul);
		square1.setExpression(add);
		System.out.println(square1.evaluate());
		try{
			div.setExpression(number1, number0);
			System.out.println(div.evaluate());
		}catch(ArithmeticException ex){
			System.out.println("Loi chia cho 0 ");
		}
	}
}
