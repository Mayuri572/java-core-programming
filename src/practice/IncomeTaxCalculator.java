package practice;

import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        float income = sc.nextFloat();
        float tax;

        if(income < 500_000){
            tax = 0;
        }
        else if (income >= 500_000 && income <= 10_00_000){
            tax = 0.20f;
        }
        else{
            tax = 0.30f;
        }
        System.out.println("Income tax: " + tax);

        sc.close();
    }
}
