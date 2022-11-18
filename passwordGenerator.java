// idea courtesy geeks for geeks
// code by satyarth
import java.util.*;

public class passwordGenerator
{
	public static void main(String[] args)
	{
	
		int length = 8;
		
		System.out.println(genPassword(length));
	}

	
	static char[] genPassword(int len)
	{
		System.out.println("Using Random() to generate password - ");
		
		System.out.print("NEW PASSWORD :-  ");

		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
	    String symbols = "@#&";


		String values = upper + lower + num + symbols;


		Random rand = new Random();   // using random class to generate random object

		char[] password = new char[len];

		for (int i = 0; i < len; i++)
		{
			
			password[i] = values.charAt(rand.nextInt(values.length()));

		}
		return password;
	}
}

