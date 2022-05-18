import java.util.Scanner;
class calculate
{
void area(int a)
{
	System.out.println("The area of Square is "+a*a);
} 
void area(int l,int w)
{
	System.out.println("The area of rectangle is "+l*w);
}
void area(double r)
{
	System.out.println("The area of circle is "+(3.14*r*r));
}
}
class Area
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
calculate c=new calculate();
System.out.println("Enter the length of a Square: ");
int a=s.nextInt();
System.out.println("Enter the length of Rectangle");
int l=s.nextInt();
System.out.println("Enter the breadth of Rectangle");
int w=s.nextInt();
System.out.println("Enter the radius of Circle");
double r=s.nextDouble();
c.area(a);
c.area(l,w);
c.area(r);
}
}
