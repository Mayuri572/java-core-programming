//Marks into Percentage
import java.util.Scanner;
public class MarksIntoPercentage {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the Your Marks");
            System.out.println("English: ");
            double a = sc.nextDouble();
            System.out.println("Marathi: ");
            double b = sc.nextDouble();
            System.out.println("Hindi: ");
            double c = sc.nextDouble();
            System.out.println("Maths: ");
            double d = sc.nextDouble();
            System.out.println("EVS: ");
            double h = sc.nextDouble();
            double sum = (a + b + c + d + h);
            int Out_of = 500;
            double percentage = ((sum / Out_of)* 100);
            System.out.println("Percentage = "+ percentage+"%");

        }
    }
}
