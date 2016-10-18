package studycafe.homework_3_1;

import java.util.Scanner;

public class StudentInput {
	
	
	static Scanner scan=new Scanner(System.in);
	
	public static String InputName(int index){
		System.out.print("["+index+"]"+"학생 이름 입력:");
		String name=scan.nextLine();
		return name;
	}
	public static String InputName(){
		System.out.print("변경할 학생의 이름 입력:");
		String name=scan.nextLine();
		return name;
	}
	
	public static String InputAddress(int index){
		System.out.print("["+index+"]"+"학생 주소 입력:");
		String address=scan.nextLine();
		return address;
	}
	public static String InputAddress(){
		System.out.print("변경할 학생 주소 입력:");
		String address=scan.nextLine();
		return address;
	}
	
	public static int InputAge(int index){
		System.out.print("["+index+"]"+"학생 나이 입력:");
		int age=scan.nextInt();
		scan.nextLine();
		return age;
	}
	public static int InputAge(){
		System.out.print("변경할 학생 나이 입력:");
		int age=scan.nextInt();
		scan.nextLine();
		return age;
	}
	
	
}