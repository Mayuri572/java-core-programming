package Operators;

public class UnaryOperator {
    public static void main(String[] args){
        int a = 10;

        System.out.println("Original value: " + a);

        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a));

        // Post-increment
        System.out.println("Post-increment (a++): " + (a++));

        // Value after post-increment
        System.out.println("Value after post-increment: " + a);

        // Pre-decrement
        System.out.println("Pre-decrement (--a): " + (--a));

        // Post-decrement
        System.out.println("Post-decrement (a--): " + (a--));

        // Final value
        System.out.println("Final value: " + a);
    }
}
