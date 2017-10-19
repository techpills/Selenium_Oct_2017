package java_test;

public class Employee {
	
	public String name;
	
	private float salary;
	
	public Employee(String empName)
	{
		name = empName;
	}
	
	public void setSalary(float empSalary)
	{
		salary = empSalary;
	}
	
	public void printEmp()
	{
		System.out.println("name :" +name);
		System.out.println("salary :" +salary);
	}
	
	public static void main(String args[])
	{
		Employee emp = new Employee("Viknesh");
		emp.setSalary(100000);
		emp.printEmp();
		
	}

}
