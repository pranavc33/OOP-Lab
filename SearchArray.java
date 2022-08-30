import java.util.Scanner;

class SearchArray{
    public static void main(String args[]){
        int arr[] = {1,2,3,1,2,1,5,6,7};
        int number;
        System.out.println("Enter the number to be searched");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
            for(int i = 0; i<=arr.length-1; i++) {
                if (arr[i] == number){
                    System.out.println(i);
                } 
                
            }
        }
    }
