import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter First Numder:  ");
            double a = sc.nextDouble();
             System.out.print("Enter Second Numder:  ");
            double b = sc.nextDouble();
            double sum = a + b;
            System.out.println("Sum = "+ sum);
        }
    }
}
