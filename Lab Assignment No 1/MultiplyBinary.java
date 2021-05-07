import java.util.*;
public class MultiplyBinary 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter first binary number"); 
		String first = sc.nextLine(); 
		System.out.println("Please enter second binary number"); 
		String second = sc.nextLine(); 
		String multiplication  = multiplyBinary(first, second); 
		System.out.println("multiplication of two binary number is : " + multiplication); 
	}
	public static String multiplyBinary(String first, String second)
	{ 
		int number0 = Integer.parseInt(first, 2); 
		int number1 = Integer.parseInt(second, 2); 
		int multiply = number0 * number1; 
		return Integer.toBinaryString(multiply); 
	}
}
