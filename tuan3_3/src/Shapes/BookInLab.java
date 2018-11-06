package Shapes;
public class BookInLab{
	private String name;
	private String id;
	private String reader;
	private int Number;
	public BookInLab(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setReader(String reader){
		this.reader = reader;
	}
	public String getName(){
		return name;
		}
	public int getNumber(){
		return Number;
	}
	public int getId(){
		return id;
	}
	public String getReader(){
		return reader;
	}
				
}