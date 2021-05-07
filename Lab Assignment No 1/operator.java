import java.util.Scanner;
class operator
{
	public static void main(String args[])
	{
		int num1 , num2, add, sub, divide, multiply,remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println( " Enter first number");
		num1 = sc.nextInt();
		System.out.println( " Enter second number");
		num2 = sc.nextInt();
		add = num1 + num2;
		sub = num1 - num2;
		multiply = num1 * num2;
		divide = num1 / num2;
		remainder = num1 % num2;
		System.out.println( num1+  "+"  +num2 +  "="  +add);
		System.out.println( num1+  "-"  +num2+  "="  +sub);
		System.out.println( num1+  "*" +num2+  "="  +multiply);
		System.out.println( num1+ "/" +num2+ "=" +divide);
		System.out.println( num1+ "mod" +num2+ "=" +remainder);
	}
}	