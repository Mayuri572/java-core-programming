package variablesanddatatypes;

import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Roll no: ");
        int Roll_no = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name: ");
        String Student_name = sc.nextLine();

        System.out.println("Roll-No:" + Roll_no);
        System.out.println("Name:" + Student_name);
    }
}
