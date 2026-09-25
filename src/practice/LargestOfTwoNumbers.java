package practice;

import java.util.*;

public class LargestOfTwoNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int firstnumber = sc.nextInt();
        System.out.print("Enter second number:");
        int secondnumber = sc.nextInt();

        if(firstnumber > secondnumber){
            System.out.println("first number is greater than second number");
        }

        else{
            System.out.println("second number is greater than first number");
        }
    }
}
