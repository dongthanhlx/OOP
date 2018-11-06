package Shapes;

public class PERSON {
	private String _name,_address,_department;
	public PERSON(){
		_name = " ";
		_address = " ";
		_department = " ";
	}
	public void setName(String name){
		_name = name;
	}
	public void setAddress(String address){
		_address = address;
	}
	public void setDepartment(String department){
		_department = department;
	}
	public String getName(){
		return _name;
	}
	public String getAddress(){
		return _address;
	}
	public String getDepartment(){
		return _department;
	}
	public void print(){
		System.out.println(_name+"\t"+_address);
	}
}
