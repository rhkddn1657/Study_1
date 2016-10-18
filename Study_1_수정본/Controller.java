
package studycafe.homework_3_1;

import java.util.Scanner;

public class Controller {
	StudentManager studentmanager=new StudentManager();
	Scanner scan;
	int index=1;
	Controller(){
		this.scan=new Scanner(System.in);
	}
	
	public void Select(){
		while(true){
			System.out.println("1.학생 정보 입력 / 2.학생 정보 수정 / 3.전체 학생 정보 출력 / 4.종료");
			int sel=scan.nextInt();
			scan.nextLine();
			if(sel==4){
				System.out.println("해당프로그램을 종료합니다.");
				break;
			}
			else{
				SelectStart(sel);
			}
		}
	}
	public void SelectStart(int sel){
		switch(sel){
		case 1:
			studentmanager.addStudent(new Student(StudentInput.InputName(index),
					StudentInput.InputAddress(index),StudentInput.InputAge(index)));
			index++;
			break;
		case 2:
			studentmanager.existName(StudentInput.InputName());
			break;
		case 3:
			studentmanager.printAllStudent();
			break;
		}
	}
	
}
