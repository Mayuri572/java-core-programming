import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {

       try( Scanner sc = new Scanner(System.in);){
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // Arithmetic Operators
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        // Relational Operators
        System.out.println("Equal to: " + (x == y));
        System.out.println("Not equal to: " + (x != y));
        System.out.println("Greater than: " + (x > y));
        System.out.println("Less than: " + (x < y));
        System.out.println("Greater than or equal to: " + (x >= y));
        System.out.println("Less than or equal to: " + (x <= y));

        // Logical Operators
        boolean a = true;
        boolean b = false;
        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("NOT: " + !a);

        sc.close();
    }
}
}
