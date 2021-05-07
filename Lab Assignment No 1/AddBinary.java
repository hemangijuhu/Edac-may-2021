import java.util. * ;
public class AddBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in );
		System.out.println("Please enter first binary number");
		String first = sc.nextLine();
		System.out.println("Please enter second binary number");
		String second = sc.nextLine();
		String addition = addBinary(first, second);
		System.out.println("addition of two binary number is : " + addition);
	}
	public static String addBinary(String first, String second) {
		int number0 = Integer.parseInt(first, 2);
		int number1 = Integer.parseInt(second, 2);
		int sum = number0 + number1;
		return Integer.toBinaryString(sum);
	}
}