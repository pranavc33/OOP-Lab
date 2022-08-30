import java.util.Scanner;
class PositiveNegative{
	public static void main(String args[]){
		 int total, num, i=0, countP=0, countN=0, countZ=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Size: ");
      total = scan.nextInt();
      System.out.print("Enter " +total+ " Numbers: ");
      while(i<total)
      {
         num = scan.nextInt();
         if(num<0){
            countN++;
         }
         else if(num>0){
            countP++;
         }
         else if (num==0) {
         countZ++;
         }
         i++;
      }
      
      System.out.println("\nTotal Positive Numbers: " +countP);
      System.out.println("\nTotal Negative Numbers: " +countN);
      System.out.println("\nTotal Zero Numbers:" +countZ);
   }
}