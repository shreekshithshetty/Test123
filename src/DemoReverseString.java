import java.util.Scanner;

public class DemoReverseString {
	
	public static String ReverseString(String s)
	{
		String rs="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rs=rs+s.charAt(i);
		}
		
		return rs;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String to reverse");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(ReverseString(s));
		
	}
 
}
