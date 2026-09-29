package practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int rev = 0;

        while(number> 0){
            int lastdigit = number% 10;
            number = number / 10;
            rev = (rev* 10) + lastdigit;
        }
        System.out.println("Reverse number:" + rev);
    }
}
