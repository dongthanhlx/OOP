package tuan03_1;

import java.util.Scanner;

public class Cau1a{
	public static int abs(int n){
		if(n>=0)	return n;
		else return n*(-1);
	}
	public static int ucln(int a,int b){
		a=abs(a);
		b=abs(b);
		while(a!=b)	if(a>b) a-=b;
		else b-=a;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a = ");
		a = scanner.nextInt();
		System.out.print("Nhap b = ");
		b = scanner.nextInt();
		System.out.println("Uoc chung lon nhat cua a va b la : "+ucln(a,b));
		scanner.close();
	}

}
