import java.util.*;
public class otpGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String num = "0123456789";   // string of numbers 
		
		Random rand= new Random();	// random object to get random values
		
		System.out.print("ENTER THE SIZE OF OTP :- "); // getting size of otp
		int otpsize= sc.nextInt();
		
		char[] otp= new char[otpsize];
		
		System.out.print("\nYOUR NEW OTP IS :- ");
		
		for(int i=0;i<otp.length;i++) {
			
			otp[i]= num.charAt(rand.nextInt(num.length()));  // storing random no. at each index 
			
		}
		
		System.out.println(otp);
		
		

	}

}
