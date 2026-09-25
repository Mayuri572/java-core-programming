package Operators;

public class TernaryOperator {
    public static void main(String[] args) {

        int number = 15;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number = " + number);
        System.out.println("Result = " + result);
    }
}
