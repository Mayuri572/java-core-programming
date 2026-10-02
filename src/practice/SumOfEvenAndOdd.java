package practice;

import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String[] args){
        System.out.print("Enter the n number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenSum= 0;
        int oddSum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Enter "+ i + " number");
            int num = sc.nextInt();
            if(num%2 == 0){
                evenSum+=num;
            }
            else{
                oddSum+= num;
            }
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: "+ oddSum);
        sc.close();
    }

}
