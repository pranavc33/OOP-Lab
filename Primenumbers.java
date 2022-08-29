import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int sum = 0;
        int rem;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("Its an Armstrong no.");
        } else {
            System.out.println("Its not an Armstrong no.");
        }
    }
}

