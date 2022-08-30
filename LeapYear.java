import java.util.Scanner;
class LeapYear{

  public static void main(String[] args) {

    System.out.println("Enter the year");
	Scanner in = new Scanner(System.in);
	int year;
	year = in.nextInt();
    boolean leap;

    if (year % 4 == 0) {
      if (year % 100 == 0) {

   
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
    }
    
    else
      leap = false;

    if (leap = true)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}