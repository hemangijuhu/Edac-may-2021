import java.util.Scanner;
class Divide
{
public static void main(String args[])
{
int num1 , num2, result;
Scanner sc = new Scanner(System.in);
System.out.println( " Enter 2 numbers");
num1 = sc.nextInt();
num2 = sc.nextInt();
result = num1 / num2;
System.out.println( "Division Result : "   +result);
}}