import java.util.Scanner;
import java.lang.*;
class StringToChar
{
	public void method(String st)
	{
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			System.out.println("Character at "+i+" position "+ch);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Convert String to Char");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String");
		String st = scan.nextLine();

		StringToChar stc = new StringToChar();
		stc.method(st);
	}
}
