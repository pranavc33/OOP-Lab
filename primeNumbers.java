import java.util.Scanner;

class primeNumbers{
    public static void main(String args[]) {
        int n, m, i,j;
        // int num;
        int flag = 0;
        System.out.println("Enter lower limit:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter upper limit:");
        m=sc.nextInt();
        System.out.println("Prime Numbers:");
       
        for(i = n; i<= m; i++){
            for(j=2; j<i; j++) {
            if (i % j == 0) {
            flag = 0;
            break;
            }
            else {
                flag =1;
            }
            }
            if (flag == 1){
                 System.out.println(i);
            
            }   
         } 
       } 
    }



