package loops;

public class BreakStatement {
    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            if (number == 6) {
                break;
            }

            System.out.println(number);
        }
    }
}
