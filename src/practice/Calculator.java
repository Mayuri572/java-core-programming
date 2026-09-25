package practice;

import java.util.*;

public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("----Select Number For Operation----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulo");

        System.out.print("Enter your choice: ");
        int number = sc.nextInt();

        switch(number){

            case 1:
                System.out.println("Addition: " + (a+b));
                break;

            case 2:
                System.out.println("Subtraction: " + (a-b));
                break;

            case 3:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case 4:
                System.out.println("Multiplication: " + (a*b));
                break;

            case 5:
                System.out.println("Remainder:" + (a%b));
                break;

            default:
                System.out.println("Invaild number");
                break;
        }
        sc.close();
    }
}
