import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String name = sc.nextLine();

        String reversed = "";

        for(int i = name.length() -1 ; i >= 0; i--){
            reversed += name.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
        System.out.println(name.length());
        System.out.println(name.length() - 1);

    }
}
