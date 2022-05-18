import java.util.Scanner;
class Person
{
	String Name;
	String Gender;
	String Address;
	int Age;
	Person(String name,String g,String add,int age)
	{
		this.Name=name;
		this.Gender=g;
		this.Address=add;
		this.Age=age;
	}
}
class Employee extends Person
{
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	Employee(String name,String g,String add,int age,int id,String com,String Qua,double sal)
	{
		super(name,g,add,age);
		this.Empid=id;
		this.Company_name=com;
		this.Qualification=Qua;
		this.Salary=sal;
	}
}
class Teacher extends Employee
{
	String Subject;
	String Department;
	int Teacherid;
	Teacher(String name,String g,String add,int age,int id,String com,String Qua,double sal,String sub,String dept,int tid)
	{
		super(name,g,add,age,id,com,Qua,sal);
		this.Subject=sub;
		this.Department=dept;
		this.Teacherid=tid;
	}
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Gender: "+Gender);
		System.out.println("Address: "+Address);
		System.out.println("Age: "+Age);
		System.out.println("Empid: "+Empid);
		System.out.println("Company name: "+Company_name);
		System.out.println("Qualification: "+Qualification);
		System.out.println("Salary: "+Salary);
		System.out.println("Subject: "+Subject);
		System.out.println("Department: "+Department);
		System.out.println("Teacherid: "+Teacherid);
	}
}
class MultilevelInheritence
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no.of teachers");
		int n=s.nextInt();
		Teacher a[]=new Teacher[n];
		for(int i=0;i<n;i++)
		{
		    System.out.print("\n\n___________\n\nEnter the Details of Teacher "+(i+1)+"\n___________\n\n");
		    System.out.print("Enter the Name : ");
		    String name = s.next();
		    System.out.print("\nEnter the Gender : ");
		    String gender = s.next();
		    System.out.print("\nEnter the Address : ");
		    String Add = s.next();
		    System.out.print("\nEnter the Age : ");
		    int age = s.nextInt();
		    System.out.print("\nEnter the Employee Id : ");
		    int Eid = s.nextInt();
		    System.out.print("\nEnter the Company Name : ");
		    String cname = s.next();
		    System.out.print("\nEnter the Qualification : ");
		    String ql = s.next();
		    System.out.print("\nEnter the Salary : ");
		    double salary = s.nextDouble();
		    System.out.print("\nEnter the Department : ");
		    String Dept = s.next();
		    System.out.print("\nEnter the Subject tought by the teacher : ");
		    String sub = s.next();
		    System.out.print("\nEnter the Teacher Id : ");
		    int Tid = s.nextInt();
		    a[i]=new Teacher(name,gender,Add,age,Eid,cname,ql,salary,Dept,sub,Tid);
		}
		System.out.println("\n********Informations of all the Teachers************");
		for(int i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}
			
		   
