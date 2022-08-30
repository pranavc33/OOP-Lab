import java.util.Scanner;
class calculator{
    public static void main(String args[]){
        float number1, number2;
        char operator;
        char response;
        float a,b ,result;
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextFloat();
        System.out.println("Enter second number:");
        number2 = input.nextFloat();
        System.out.println("Choose an operator:");
        operator = input.next().charAt(0);
    
    
        switch(operator){

        case '+': 
         result = number1 +  number2;
        System.out.println(result);
        break; 

        case '-':
        if(number1 > number2){
         result  = number1 - number2;
        }
        else 
         result =  number2 -  number1;
        System.out.println(result);
        break;

        case '*':
         result  = number1 * number2;
                System.out.println(result);
        break;

        case '/':
         result =  number1 /  number2;
        System.out.println(result);
        break;

        default:
                System.out.println("Enter valid input");   
        break;
        }
        System.out.println("Do you want to continue?");
        response = input.next().charAt(0);

    }
}