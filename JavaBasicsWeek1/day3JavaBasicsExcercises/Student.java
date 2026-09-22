package day3JavaBasicsExcercises;

public class Student {
	
	String name;
	int roll_no;
	int phone_no;
	String address;
	
	Student(){
		name = "John";
		roll_no =2;
	}
	
	Student(String name,int roll_no, int phone_no, String address)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
			
		
	}
	public static void main(String[] args) {
	
		Student student = new Student();
		System.out.println("Name :"+student.name+" Roll No:"+student.roll_no);
		
		Student student1 = new Student("Sam",1,12345,"Booth dr");
		Student student2 = new Student("John",2,54321,"Ohio dr");
		
		System.out.println("Name :"+student1.name+" Roll No:"+student1.roll_no+" Phone no :"+student1.phone_no+" Address :"+student1.address);
		System.out.println("Name :"+student2.name+" Roll No:"+student2.roll_no+" Phone no :"+student2.phone_no+" Address :"+student2.address);
		

	}

}
