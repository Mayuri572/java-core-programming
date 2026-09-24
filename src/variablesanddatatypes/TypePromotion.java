package variablesanddatatypes;

public class TypePromotion {
    public static void main(String[] args){
        char a ='a';
        char b = 'b';

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);

/*
        byte c = 5;
        c = c*2;
        System.out.println(c); java: incompatible types: possible lossy conversion from int to byte


 */

    }
}
