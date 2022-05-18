import java.util.Scanner;
class Employee
{
	int Empid;
	String Name; 
	double Salary;
	String Address;
	Employee(int id,String name,double sal,String add)
	{
		this.Empid=id;
		this.Name=name;
		this.Salary=sal;
		this.Address=add;
	}
}
class Teacher extends Employee
{
	String department;
	String Subjects_taught;
	Teacher(int id,String name,double sal,String add,String dept,String sub)
	{
		super(id,name,sal,add);
		this.department=dept;
		this.Subjects_taught=sub;
	}
	void display()
	{
		System.out.println("Empid : "+Empid);
		System.out.println("Name : "+Name);
		System.out.println("Salary : "+Salary);
		System.out.println("Address : "+Address);
		System.out.println("Department : "+department);
		System.out.println("Subject : "+Subjects_taught);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		System.out.println("Enter the numberof employees");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		Teacher a[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the employee id");
		int id=s.nextInt();
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the Salary");
		double sal=s.nextDouble();
		System.out.println("Enter the Address");
		String add=s.next();
		System.out.println("Enter the Department");
		String dept=s.next();
		System.out.println("Enter the Subject taught");
		String sub=s.next();	
		a[i]=new Teacher(id,name,sal,add,dept,sub);
		}
	System.out.println("\n********Informations of all the employee's************");
    	for(int i=0;i<n;i++){
        	int j=i+1;
        	System.out.println("\n"+j+").");
        	a[i].display();
	}
}
}



