
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
                System.out.print("Enter a number (0 to stop): ");
                number = sc.nextInt();
                System.out.println("You entered: " + number);
            } while (number != 0);
    }
}
