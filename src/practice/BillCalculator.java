package practice;

import java.util.*;

public class BillCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Price of Pencil:");
        float pencil = sc.nextFloat();

        System.out.print("Enter the Price of Pen:");
        float pen = sc.nextFloat();

        System.out.print("Enter the Price of Eraser:");
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        float gst = (float)(total * 0.18);
        float totalBill = (total + gst);

        System.out.println("\n---- Bill ----");
        System.out.println("Total cost:" + total);
        System.out.println("Total GST:" + gst);
        System.out.println("Total Bill:" + totalBill);

        sc.close();


    }
}
