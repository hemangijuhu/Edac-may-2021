import java.util.Scanner;
class Multiplication
{
	public static void main(String args[])
	{
		int num1 , num2, multiply;
		Scanner sc = new Scanner(System.in);
		System.out.println( " Enter first number");
		num1 = sc.nextInt();
		System.out.println( " Enter second number");
		num2 = sc.nextInt();
		multiply = num1 * num2;
		System.out.println( num1 +  "*"  + num2 +  "="  +multiply);
	}
}	