package studycafe.homework_3;
import java.util.List;
import java.util.Scanner;

public class StudentInfor {
	private String name;
	private String location;
	private int age;
	static int index=1;
	private static Scanner scan=new Scanner(System.in);
	StudentInfor(String name,String location,int age){
		this.name=name;
		this.location=location;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	public String getLocation(){
		return location;
	}
	public int getAge(){
		return age;
	}
	
	public static void studentInput(List<StudentInfor> list){
		
		System.out.print("["+index+"]"+"�л� �̸�: ");
		String name=scan.nextLine();
		
		System.out.print("["+index+"]"+"�л� ���ּ�: ");
		String location=scan.nextLine();
		
		System.out.print("["+index+"]"+"�л� ����: ");
		int age=scan.nextInt();
		scan.nextLine();
		list.add(new StudentInfor(name,location,age));
		index++;
	}
	public static void studentChange(List<StudentInfor> list){
		boolean result=false;
		System.out.print("������ �ٲ� �л��� �̸�: ");
		String name=scan.nextLine();
		for(int j=0;j<list.size();j++){
			if(name.equals(list.get(j).getName())){
				System.out.print("������ �л� ���ּ�: ");
				String location=scan.nextLine();
					
				System.out.print("������ �л� ����: ");
				int age=scan.nextInt();
					
				list.set(j,new StudentInfor(name,location,age));
				result=true;
			}
		}
		if(!result){
			System.out.println("�ش� �л� �̸��� �����ϴ�.");
		}
	}
	public static void studentPrint(List<StudentInfor> list){
		for(int j=0;j<list.size();j++){
			System.out.println("["+(j+1)+"]"+"�л� �̸�:"+list.get(j).getName());
			System.out.println("["+(j+1)+"]"+"�л� ���ּ�:"+list.get(j).getLocation());
			System.out.println("["+(j+1)+"]"+"�л� ����:"+list.get(j).getAge());
			System.out.println("============================================");
		}
	}
}
