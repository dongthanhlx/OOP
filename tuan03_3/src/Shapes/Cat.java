package Shapes;

public class Cat extends QL{
	protected String name;
	protected int age;
	protected int weight;
	public Cat(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getWeight(){
		return weight;
	}
}
