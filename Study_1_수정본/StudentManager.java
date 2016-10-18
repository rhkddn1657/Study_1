package studycafe.homework_3_1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManager {
	List<Student> list;
	Scanner scan;
	StudentManager(){
		this.list=new ArrayList<>();
		scan=new Scanner(System.in);
	}
	
	public void addStudent(Student student){
		list.add(student);
	}
	
	public void existName(String name){
		boolean result=false;
		for(int i=0;i<list.size();i++){
			if(name.equals(list.get(i).getName())){
				list.set(i,new Student(name,StudentInput.InputAddress(),StudentInput.InputAge()));	
				result=true;
			}
		}
		if(!result){
			System.out.println("해당 이름의 학생정보가 없습니다.");
		}
	}
	public void printAllStudent(){
		for(int i=0;i<list.size();i++){
			System.out.println("["+(i+1)+"]"+"학생 이름:"+list.get(i).getName());
			System.out.println("["+(i+1)+"]"+"학생 사는 곳:"+list.get(i).getAddress());
			System.out.println("["+(i+1)+"]"+"학생 나이:"+list.get(i).getAge());
			System.out.println("============================================");
		}
	}
}