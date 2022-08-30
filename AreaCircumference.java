class Area_Circumference 
{
 public static void main(String[] args) 
 {
 int l, b, Circumference, area;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter length of rectangle:");
 l = s.nextInt();
 System.out.print("Enter breadth of rectangle:");
 b = s.nextInt();
 Circumference = 2 * (l + b);
 System.out.println("Circumference of rectangle:"+Circumference);
 area = l * b;
 System.out.println("Area of rectangle:"+area);
}
}