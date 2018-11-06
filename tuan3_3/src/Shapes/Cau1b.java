package Fibonaxi;

import java.util.Scanner;

public class Cau1b{
	public static int fibo(int n){
		if(n<=1) return 1;
		else return fibo(n-1)+fibo(n-2);	//de quy 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.print("Nhap so duong n :");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		while(n<0){
			System.out.print("Nhap lai so n : ");
			n = scanner.nextInt();
		}
		System.out.println("Result = "+fibo(n));
		scanner.close();
	}

}
