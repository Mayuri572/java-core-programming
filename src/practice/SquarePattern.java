package practice;

import java.util.*;

public class SquarePattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        for(int row= 1; row <= n; row++){
            for(int column= 1; column <= n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
