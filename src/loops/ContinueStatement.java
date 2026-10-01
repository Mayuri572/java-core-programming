package loops;

public class ContinueStatement {
    public static void main(String[] args){


         for(int num = 1; num <=10; num++){
             if(num == 6){
                 continue;
             }
             System.out.println(num);
         }
    }
}
