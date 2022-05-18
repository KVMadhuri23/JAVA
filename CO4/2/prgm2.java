import java.util.Scanner;
import arithematic.*;
class prgm2
{
	public static void main(String args[])
	{	
		int a,b;
		Scanner sc = new Scanner(System.in);		
		Calculate c= new Calculate();
		System.out.println("Enter first number: " );
		a=sc.nextInt();
		System.out.println("Enter second number: " );
		b=sc.nextInt();
		System.out.println(" After Arithematic operations " );	
		System.out.println("------------------------------" );		 
		System.out.println("Addition: "+c.add_op(a,b));
		System.out.println("Subtraction: "+c.sub_op(a,b));
		System.out.println("Multiplication: "+c.mul_op(a,b));
		System.out.println("Division: "+c.div_op(a,b));
		

	}
}
	
