import java.util.*;
public class circle{
	
	public static void main(String args[]) {
		
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		radius = sc.nextDouble();
		double Perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter is = " + Perimeter);
		double area = Math.PI * radius * radius;
		System.out.println("area  is = " + area);
	}
}