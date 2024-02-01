package MethodAndConstructure.constructure;

public class Student {
	Student(){System.out.println("This is default constructure of student");}
	
	public Student getStudent() {
		return new Student();
	}
}
