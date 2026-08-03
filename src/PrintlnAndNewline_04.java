public class PrintlnAndNewline_04 {
    public static void main(String[] args) {
        /*
         * Program: println(), print(), and New Line (\n)
         * Description:
         * Demonstrates the difference between print(),
         * println(), and the newline escape sequence.
         */

        // println() moves the cursor to the next line
        System.out.println("Welcome");
        System.out.println("Java Programming");

        // print() keeps the cursor on the same line
        System.out.print("Java ");
        System.out.print("Programming");

        System.out.println();

        // Using newline escape sequence
        System.out.println("Line 1\nLine 2\nLine 3");
    }
}
