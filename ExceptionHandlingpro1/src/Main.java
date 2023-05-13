/*
what is exception?
-> exception is a event .which occur at run time is know as exception.also to distrub normal flow of code.
what is exception handling?
-> to handle run time error is know as exception handling.
type of exception
there are three type of exception.
1)checked exception.
2)uncheck exception.
3)error.

*/
import java.util.*;
import java.lang.Throwable;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        try{
             c=a/b;
             System.out.println("output is"+c);
        }
        catch(ArithmeticException ex){
            System.out.println("ArithmeticException occur");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }


    }
}