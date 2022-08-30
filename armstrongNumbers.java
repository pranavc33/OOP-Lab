import java.util.Scanner;

class armstrongNumbers{
    public static void main(String args[]) {
        int sum ,temp =  0;
         int rem;
         int num;
        //  int temp = 0;

        System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
            }    
        if (temp == num) {
            System.out.println("Its an Armstrong no.");
               } else {
                    System.out.println("Its not an Armstrong no.");
                }
            
        
            }
}

        
    

