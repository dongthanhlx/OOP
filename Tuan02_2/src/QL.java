import java.util.Scanner;

public class QL extends PS{
	public QL(){
		
	}
	public void nhap(PS a){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu so :");
		a.ts = scanner.nextInt();
		System.out.print("Nhap mau so :");
		a.ms = scanner.nextInt();
		while(a.ms == 0){
			System.out.println("Nhap lai mau so .");
			a.ms = scanner.nextInt();
		}
	}
	public void hienthi(PS a){
		if(a.ms == 1) System.out.println(a.ts);
		else System.out.println(a.ts+"/"+a.ms);
	}
	public int ucln(int a,int b){
		while(a != b){
			if(a>b) a-=b;
			else b-=a;
		}
		return a;
	}
	public PS rutgon(PS a){
		PS b = new PS();
		b.ts=a.ts/ucln(a.ts,a.ms);
		b.ms=a.ms/ucln(a.ts,a.ms);
		
		return b;
	}
	public PS cong(PS a,PS b){
		PS c = new PS() ;
		c.ts=a.ts*b.ms+b.ts*a.ms;
		c.ms=a.ms*b.ms;
		return c;
	}
	public PS tru(PS a,PS b){
		PS c = new PS();
		c.ts = a.ts*b.ms - a.ms*b.ts;
		c.ms = a.ms*b.ms;
		return c;
	}
	public PS nhan(PS a,PS b){
		PS c = new PS();
		c.ts = a.ts*b.ts;
		c.ms  = a.ms*b.ms;
		return c;
	}
	public PS chia(PS a,PS b){
		PS c = new PS();
		while(b.ts == 0){
			System.out.print("Nhap lai phan so b .");
			nhap(b);
		}
		c.ts=a.ts*b.ms;
		c.ms=a.ms*b.ts;
		return c;
	}
	public boolean equals(PS a,PS b){
		if(((double)a.ts)/a.ms > ((double)b.ts)/b.ms)
			return true;
		else return false;
	}
}
