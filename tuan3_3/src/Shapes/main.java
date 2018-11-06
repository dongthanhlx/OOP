

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QL ql = new QL();
		PS ps1 = new PS();
		PS ps2 = new PS();
		ql.nhap(ps1);
		ql.nhap(ps2);
		
		ql.hienthi(ql.cong(ps1, ps2));
		ql.hienthi(ql.rutgon(ql.cong(ps1,ps2)));
		if(ql.equals(ps1,ps2)) System.out.println("phan so "+ps1.ts+"/"+ps1.ms+" lon hon "+ps2.ts+"/"+ps2.ms);
		else System.out.println("phan so "+ps1.ts+"/"+ps1.ms+"nho hon "+ps2.ts+"/"+ps2.ms);
	}
}
