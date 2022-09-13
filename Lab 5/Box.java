
import java.util.Scanner;
class Box{

    double length, width, breadth;
    Box(double l,double w, double b ){
        double length = l;
        double width = w;
        double breadth = b;
    }
        double Volume(){ 
        double volume  = this.length*this.breadth*this.width;
        return Vol;
        }
    }
    
    public class Main() {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length:");
            double l = sc.nextDouble();
            System.out.println("Enter the width: ");
            double w = sc.nextDouble();
            System.out.println("Enter the breadth: ");
            double b = sc.nextDouble();
                Box ob = new Box(l,w,b);
                System.out.println(ob.Volume());
                scan.close();


        } 
    }