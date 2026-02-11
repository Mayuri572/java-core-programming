

public class StringBasics {
        public static void main(String[] args) {

        // Different ways to create string
        String name1 = "Mayuri";
        String name2 = new String("Mayuri");

        System.out.println(name1);
        System.out.println(name2);

        // String is immutable
        name1 = name1.concat(" Jadhav");

        System.out.println("After concat: " + name1);
    }
    
}
