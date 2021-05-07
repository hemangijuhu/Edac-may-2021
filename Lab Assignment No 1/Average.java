import java.util.*;
public class Average{
	
	public static void main(String[] arg) {
		
		int num1, num2, num3, average;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter First Number");
		num1 = sc.nextInt();
		System.out.println( "Enter Second Number");
		num2 = sc.nextInt();
		System.out.println( "Enter Third Number");
		num3 = sc.nextInt();
		average =( num1 + num2 + num3) / 3;
		System.out.println("Average  is = " +average );
	}
}