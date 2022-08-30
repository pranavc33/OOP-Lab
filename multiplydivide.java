import java.util.Scanner;

class multiplydivide{
	
public static void main(String[] args){
	int number ,number1, number2;
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	
    number1 = number << 1;
	number2 = number >> 1;
	System.out.println("The number multiplied by 2 is "+number1);
	System.out.println("The number divided by 2 is "+number2);
	
}
}
	