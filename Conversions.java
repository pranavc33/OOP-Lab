import java.util.Scanner;

class Conversions{
public static void main(String[] args){
        System.out.println("Enter an integer, a double number and a character: ");
		int x;
		double y;
		char z;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextDouble();
		z = sc.next().charAt(0);

		// Scanner sc = new Scanner(System.in);
		byte a = (byte) x;
		int b = (int) z;
		byte c = (byte) y;
		int d = (int) y;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
  }
}