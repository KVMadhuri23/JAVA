import java.util.Scanner;
import java.io.*;

public class Search{


public static void main(String args[]){
int x;
int flag =0;
int i =0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the no.of elements");	
int n=s.nextInt();	
int a[] = new int[n];
System.out.println("Enter the elements : ");
for(int j =0;j <n;j++)
{
a[j] = s.nextInt();
}
System.out.println("Enter the element to search : ");
x = s.nextInt();
for(i =0;i <5;i++){
if(a[i] == x)
{
flag = 1;
break;
}
else{
flag = 0;
}
}
if(flag == 1){
System.out.println("Element found at position:" +(i+1));
}
else{
System.out.println(" Element not found");
}
}

}
