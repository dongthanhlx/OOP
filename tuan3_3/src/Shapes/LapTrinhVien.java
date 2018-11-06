package Shapes;
public class LapTrinhVien{
	private int age;
	private String name;
	private int id;
	private String email;
	private String skill;
	private int phoneNumber;
	public LapTrinhVien(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public String getSkill(){
		return skill;
	}
	public String getMail(){
		return email;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age  = age;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setMail(String email){
		this.email = email;
	}
	public void setSkill(String skill){
		this.skill = skill;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

}