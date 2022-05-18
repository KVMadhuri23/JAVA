import java.util.Scanner;
import graphics.*;
class prgm1
{
	public static void main(String args[])
	{	
		int l,b,h,s,r;
		Scanner sc = new Scanner(System.in);		
		figure f= new figure();
		System.out.println("Enter the length of rectangle:" );
		l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:" );
		b=sc.nextInt();		 
		System.out.println("Area of rectangle: "+f.rectarea(l,b));
		System.out.println("Enter the side of square:" );
		s=sc.nextInt();
		System.out.println("Area of rectangle: "+f.squarea(s));
		System.out.println("Enter the radius of circle:" );
		r=sc.nextInt();
		System.out.println("Area of circle: "+f.cirarea(r));
		System.out.println("Enter the base of triangle:" );
		b=sc.nextInt();
		System.out.println("Enter the height of triangle:" );
		h=sc.nextInt();		 
		System.out.println("Area of rectangle: "+f.triarea(b,h));
		

	}
}
	
