package Shapes;

public class laptop {
	private int gia,canNang;
	private String name,CPU;
	public laptop(){
		
	}
	public laptop(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name  = name;
	}
	public void setGia(int gia){
		this.gia = gia;
	}
	public void setCanNang(int cannang){
		canNang = cannang;
	}
	public void setCPU(String CPU){
		this.CPU = CPU;
	}
	public String getName(){
		return name;
	}
	public String getCPU(){
		return CPU;
	}
	public int getGia(){
		return gia;
	}
	public int getCanNang(){
		return canNang;
	}
}
