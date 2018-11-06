package Shapes;

public class water {
	private String _name,_vi,mauSac;
	private int _gia;
	public water(String _name){
		this._name = _name;
	}
	public void setName(String _name){
		this._name = _name;
	}
	public void setGia(int _gia){
		this._gia = _gia;
	}
	public void setMauSac(String mauSac){
		this.mauSac = mauSac;
	}
	public void setVi(String _vi){
		this._vi = _vi;
	}
	public String getName(){
		return _name;
	}
	public int getGia(){
		return _gia;
	}
	public String getMauSac(){
		return mauSac;
	}
	public String getVi(){
		return _vi;
	}
}
