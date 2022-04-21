import java.util.Scanner;
import java.util.Arrays;
	
	public class Sort{
	public static void main(String[] args){
	System.out.println("Enter the no.of Strings");	
	Scanner s = new Scanner(System.in);
	String[] string = new String[s.nextInt()];
	s.nextLine();
	System.out.println("enter the strings");
	for(int i = 0;i<string.length;i++)
	{
	string[i]  = s.nextLine();
	}
	System.out.println("After sorting : ");
	Arrays.sort(string);
	System.out.println(Arrays.toString(string));
	
	}
	}
