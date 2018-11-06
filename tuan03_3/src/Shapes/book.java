package Shapes;

public class book {
	protected String name,NXB,tenTG;
	protected int assize;
	public void setName(String name){
		this.name = name;
	}
	public void setNXB(String nxb){
		NXB = nxb;
	}
	public void setTenTG(String tenTG){
		this.tenTG = tenTG;
	}
	public void gia(int gia){
		assize = gia;
	}
	public String getName(){
		return name;
	}
	public String getNXB(){
		return NXB;
	}
	public String getTenTG(){
		return tenTG;
	}
}
