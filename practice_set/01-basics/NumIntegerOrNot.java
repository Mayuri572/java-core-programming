// number given by user is integer or not
import java.util.Scanner;
public class NumIntegerOrNot {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter Numder: ");
            System.out.println(sc.hasNextInt());
        }
    }
}
