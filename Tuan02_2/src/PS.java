

public class PS {
	protected int ts,ms;
	public PS(){
		ts=1;
		ms=1;
	}
	public PS(int ts,int ms){
	this.ts = ts;
	this.ms = ms;
	}
	public void setTS(int ts){
		this.ts = ts;
	}
	public void setMS(int ms){
		this.ms = ms;
	}
	public int getMS(){
		return ms;
	}
	public int getTS(){
		return ts;
	}
	
}
