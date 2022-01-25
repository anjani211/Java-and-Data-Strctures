import java.util.Scanner;
public class conditionalsAndLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary: ");
        int b = sc.nextInt();
        /*
        Syntax of conditionals:
        if(boolean expression T or F){
            //body
        }else{
            //do this
        }
        */
        
        if(b > 15000){
            b  = b + 3000;
        }
        else if(b > 10000){
            b = b + 2000;

        } else{
            b = b + 1000;
        }
        System.out.println(b);
         
        
    }
}
