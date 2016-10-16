package studycafe.homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	static Scanner scan;
	public static void main(String[] args){
		List<StudentInfor> list=new ArrayList<>();
		scan=new Scanner(System.in);
		
		while(true){
			System.out.println("1.학생 정보 입력 / 2.학생 정보 수정 / 3.전체 학생 정보 출력 / 4.종료");
			int sel=scan.nextInt();
			scan.nextLine();
			if(sel==1){//학생 정보 입력
				StudentInfor.studentInput(list);
			}
			else if(sel==2){//학생 정보 수정
				StudentInfor.studentChange(list);
			}
			else if(sel==3){//전체 학생 정보 출력
				StudentInfor.studentPrint(list);
			}
			else{//종료
				System.out.println(" /* 해당 프로그램을 종료합니다 */ .");
				break;
			}
		}

	}
}
