import java.util.Scanner;
public class String_man
{
public static void main(String[ ] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String st = s.nextLine();
 	System.out.println("Length of String : "+st.length());
        System.out.println("To Uppercase : "+st.toUpperCase());
        System.out.println("To Lowercase : "+st.toLowerCase());
	String str2="welcome to java";
        System.out.println("New String : "+str2);
        System.out.println("String Concatination : "+st.concat(str2));
        System.out.println("Index of a word \"java\" in"+str2+" : "+str2.indexOf("java"));
        System.out.println("String replacement \"java to python\" : "+str2.replace("java", "python"));
}
}
