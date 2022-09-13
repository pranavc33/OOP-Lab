// import java.util.Scanner;
// class Employee{
// String name;
// String city;
// int salary;
// int allowance;
// int rent;


//  void getData(){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter name: ");
//     this.name = sc.nextLine();
//     System.out.println("Enter city");
//     this.city  = sc.nextLine();
//     System.out.println("Enter salary: ");
//     this.salary = sc.nextInt();
//         System.out.println("Enter allowance: ");
//         this.allowance = sc.nextInt();
//                 System.out.println("Enter rent: ");
//                         this.rent= sc.nextInt();
// }

//  void Calculate(){
//     Scanner sc  = new Scanner(System.in);
//     int total;
//     this.total =  salary + (salary*allowance/100.0) + (salary*rent/100.0);

// }

//  void display(){
//      return this.total;

// }


//  public class Main{
//     public static void main(String args[]){
//     Employee e1 = new Employee(System.in);
//     e1.getData();
//     e1.Calculate();
//     e1.display();

//     System.out.println(e1.display());
//     }
//   }
// }

import java.util.Scanner;
class Employee{
    String name;
    String city;
    int salary;
    double allowance;
    double rent;
    double total;
    void getdata(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the name:");
        this.name=scan.nextLine();
        System.out.println("Enter the city:");
        this.city=scan.nextLine();
        System.out.println("Enter the salary:");
        this.salary=scan.nextInt();
        System.out.println("Enter the allowance:");
        this.allowance=scan.nextDouble();
        System.out.println("Enter the rent:");
        this.rent=scan.nextDouble();
        scan.close();
    }
    void calculate(){
        this.total= salary+(salary*allowance/100.0)+(salary*rent/100.0);
    }

    double display(){
        return this.total;
    }
}

public class Employees{
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.getdata();
        e1.calculate();
        System.out.println(e1.display());
    }
} 