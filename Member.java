
public class Member {
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
	class Employee extends Member{
		String specialization;
	}
	class manager extends Member{
		String department
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Employee e = new Employee();
		e.name="ahmed";
		e.age = 26;
		e.phonenumber = "703-849-2200";
		e.address="333 jive st";
		e.salary= 60000;
		e.specialization = ""
				
 }
	}

}
