package Shapes;
public class FacebookAcount{
	private String name;
	private String id;
	private String email;
	private int age;
	private int phoneNumber;
	public FacebookAcount(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setMail(String email){
		this.email = email;
	}
	public void setAge(int age){
		this.age  = age;
	}
	public String getName(){
		return name;
		}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public int getId(){
		return id;
	}
		
	public String getMail(){
		return email;
	}

	public int getage(){
		return age;
	}
				
}