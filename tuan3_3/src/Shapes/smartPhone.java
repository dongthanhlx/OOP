package Shapes;

public class smartPhone {
	private int gia,canNang;
	private String name;
	public smartPhone(String name){
		this.name = name;
	}
	public void setGia(int gia){
		this.gia = gia;
	}
	public void setCanNang(int canNang){
		this.canNang = canNang;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getGia(){
		return gia;
	}
	public int getCanNang(){
		return canNang;
	}
	public String getName(){
		return name;
	}
}
