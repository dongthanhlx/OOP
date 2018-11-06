package main;

import java.util.Scanner;

import Shapes.CLASS;
import Shapes.STUDENT;
import Shapes.TEACHER;

public class QL {
	public QL(){
		
	}
	private int n=0,m=0,k=0;
	public CLASS[] Class = new CLASS[100];
	public TEACHER[] teacher = new TEACHER[100];
	public STUDENT[] student = new STUDENT[100];
	Scanner scanner = new Scanner(System.in);
	public void setStudent(){
		System.out.print("Numbers Student : ");		//nhap so luong sinh vien
		n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++)
			student[i] = new STUDENT();
		for(int i=0;i<n;i++){
			System.out.println("\nINFO Student "+(i+1));
			System.out.print("Name : ");
			student[i].setName(scanner.nextLine());
			System.out.print("Address : ");
			student[i].setAddress(scanner.nextLine());
			System.out.print("Class : ");
			student[i].setNameClass(scanner.nextLine());
		}
	}
	public void setTeacher(){
		System.out.print("Numbers Teacher : ");		//nhap so luong giao vien
		m = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<m;i++)
			teacher[i] = new TEACHER();
		for(int i=0;i<m;i++){
			System.out.println("\nINFO Teacher "+(i+1));
			System.out.print("Name : ");
			teacher[i].setName(scanner.nextLine());
			System.out.print("Address : ");
			teacher[i].setAddress(scanner.nextLine());
			System.out.print("Department : ");
			teacher[i].setDepartment(scanner.nextLine());
			System.out.print("Rank : ");
			teacher[i].setRank(scanner.nextLine());
			System.out.print("Teach Class : ");
			teacher[i].setNameClass(scanner.nextLine());
		}
	}
	public void setClass(){
		System.out.print("Numbers Class : ");		//nhap so luong lop
		k = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<k;i++)	
			Class[i] = new CLASS();
		for(int i=0;i<k;i++){
			System.out.println("\nINFO Class "+(i+1));
			System.out.print("Name : ");
			Class[i].setName(scanner.nextLine());
			System.out.print("Advisor : ");
			Class[i].setAdvisor(scanner.nextLine());
		}
	}
	public void getStudent(){
		for(int i=0;i<k;i++){		//duyet ten class
			System.out.println("List student "+Class[i].getName());
			for(int j=0;j<n;j++)	//duyet ten class cua sinh vien
			if(student[j].getNameClass().equals(Class[i].getName()))
				System.out.println("\t"+student[j].getName());
		}
	}
	public void getTeacher(){
		for(int i=0;i<m;i++){	//duyet cac lop giao vien 
			System.out.println("List Class of Teacher "+teacher[i].getName());
			for(int j=0;j<k;j++)	//duyet ten cac lop
				if(teacher[i].getNameClass().equals(Class[j].getName()))
					System.out.println("\t"+Class[j].getName());
		}
	}
}
