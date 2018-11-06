package Shapes;

public class giaoVien {
	private String _name,diaChi,boMon,gioiTinh;
	private int _age,_luong;
	public giaoVien(String name){
		this._name = name;
	}
	public void setName(String _name){
		this._name = _name;
	}
	public void setDiaChi(String diaChi){
		this.diaChi = diaChi;
	}
	public void setBoMon(String boMon){
		this.boMon = boMon;
	}
	public void setGioiTinh(String gioiTinh){
		this.gioiTinh = gioiTinh;
	}
	public void setAge(int _age){
		this._age = _age;
	}
	public void setLuong(int luong){
		_luong = luong;
	}
	public String getName(){
		return _name;
	}
	public String getDiaChi(){
		return diaChi;
	}
	public String getBoMon(){
		return boMon;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public int getAge(){
		return _age;
	}
	public int getLuong(){
		return _luong;
	}
}
