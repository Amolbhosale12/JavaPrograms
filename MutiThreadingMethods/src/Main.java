/*
Question 3 : Write a program to print  triangle pattern
using thread delay it's execution for 500ms
    *
   ***
  *****
 *******
*********
 */
import java.util.*;

class Triangle extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                for(int j=1;j<=9;j++){
                    if(j>=6-i && j<=4+i){
                        System.out.print("*");
                        sleep(500);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();


            }
        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }
    }

}
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        //object of table class.
        Triangle tr=new Triangle();
        tr.start();

    }
}