package Shapes;
public class Sports{
	private int age;
	private int id;
	private String name;
	private String organization;
	private String rule;
	private Sting homeCountry;

	public Sports(String name){
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
	public String getRule(){
		return rule;
	}
	public String getOrganization(){
		return organization;
	}
	public String getHomeCountry(){
		return homeCountry;
	}
	public void setName(String _name){
		name = _name;
	}
	public void setAge(int age){
		this.age  = age;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setOrganization(String organization){
		this.organization = organization;
	}
	public void setRule (String rule){
		this.rule = rule;
	}
	public void setHomeCountry(String homeCountry){
		this.homeCountry = homeCountry;
	}

}