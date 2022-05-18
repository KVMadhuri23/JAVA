import java.util.Scanner;
interface Student
{
	public void detail(Scanner r);
	public void academic(Scanner r);
}
interface Sport
{
	public void score(Scanner r);
}
class Result implements Student,Sport
{
	String name;
	int roll,tpoints,points;
	double total,mark;
	Result(Scanner r)
	{
		detail(r);
		academic(r);
		score(r);
	}
	public void detail(Scanner r)
	{
		System.out.println("Enter the name: ");
		name=r.nextLine();
		System.out.println("Enter the roll no: ");
		roll=r.nextInt();
	}
	public void academic(Scanner r)
	{
		System.out.println("Enter the maximum marks: ");
		total=r.nextDouble();
		System.out.println("Enter the marks scored: ");
		mark=r.nextDouble();
	}
	public void score(Scanner r)
	{
		System.out.println("Enter the maximum sports point: ");
		tpoints=r.nextInt();
		System.out.println("Enter the sports point obtained: ");
		points=r.nextInt();
	}
	void display()
	{
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll no of the student: "+roll);
		System.out.println("Maximum mark in academic: "+total);
		System.out.println("Marks scored in academics: "+mark);
		System.out.println("Maximum sports point: "+tpoints);
		System.out.println("Maximum sports point earned: "+points);
	}
}
class prgm5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Result res = new Result(sc);
		res.display();
	}
}
	 

	
