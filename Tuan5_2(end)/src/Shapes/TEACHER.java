package Shapes;

public class TEACHER extends PERSON{
	private String _rank;
	private String nameClass ;
	public TEACHER(){
		_rank = " ";
		nameClass = " ";
	}
	public void setRank(String rank){
		_rank = rank;
	}
	public String getRank(){
		return _rank;
	}
	public void setNameClass(String name){
		nameClass = name;
	}
	public String getNameClass(){
		return nameClass;
	}
}
