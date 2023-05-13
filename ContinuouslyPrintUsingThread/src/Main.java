/*
write a program to print "Good morning" and "AMOL" continuously on the screen in java using Thread.
 */
import java.util.*;
class First extends Thread{
    public void run(){
        try{
            for(int i=1;i>=5;i++){
                System.out.println("Amol");
                sleep(50);
            }
        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }
    }
}

class Second extends Thread{

    public void run(){
        try{
            for( int j=1;j>=5;j++){
                System.out.println("good morning");
                sleep(50);
            }
        }
        catch(Exception ex){
            System.out.println("Error is:"+ex);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("display here:");
        // create object of Thread class.
        First fr=new First();
        fr.start();
        Second se=new Second();
        se.start();
    }
}