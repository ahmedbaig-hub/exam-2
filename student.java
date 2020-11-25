package com.exam.encapsulation;

public class student {
	private String name;
	private int age;
	private String department;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
student ob=new student();
ob.name="fh";
ob.age=34 ;
ob.department="cdds";
System.out.println(ob.name);
System.out.println(ob.age);
System.out.println(ob.department);

	}

}
