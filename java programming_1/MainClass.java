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
			System.out.println("1.�л� ���� �Է� / 2.�л� ���� ���� / 3.��ü �л� ���� ��� / 4.����");
			int sel=scan.nextInt();
			scan.nextLine();
			if(sel==1){//�л� ���� �Է�
				StudentInfor.studentInput(list);
			}
			else if(sel==2){//�л� ���� ����
				StudentInfor.studentChange(list);
			}
			else if(sel==3){//��ü �л� ���� ���
				StudentInfor.studentPrint(list);
			}
			else{//����
				System.out.println(" /* �ش� ���α׷��� �����մϴ� */ .");
				break;
			}
		}

	}
}
