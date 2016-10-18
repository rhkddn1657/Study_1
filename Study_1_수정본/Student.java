package studycafe.homework_3_1;

public class Student {
	private String name;
	private String address;
	private int age;
	
	public Student(String name,String address,int age){
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getAge(){
		return age;
	}
}
