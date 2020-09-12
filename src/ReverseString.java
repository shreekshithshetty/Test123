
public class ReverseString {
	
	public static void main(String[] args)
	{
		int i;
		System.out.println("hello");
		
		String s="Shreekshith";
		int n=s.length()-1;
		for(i=0;i<=n;i++)
		{
		  for (int j=n;j>=0;j--)
		  {
		    System.out.println(s.charAt(i));
		  }
		}
		}
}
