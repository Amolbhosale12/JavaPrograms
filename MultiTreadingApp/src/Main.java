/*
Multithreading in java.
 */
import java.util.*;
class first extends Thread{

    public void run(){
            for(int i=1;i<=5;i++){
                System.out.println("first thread.");
            }

    }

}
//class second extends Thread{
//    public void run(){
//        try{
//            for(int i=0;i<50;i++){
//                System.out.println("hello second thread");
//               sleep(1000);
//
//
//            }
//        }
//        catch (Exception ex){
//
//        }
//    }
//}
public class Main {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        System.out.println("here we display how actually multithreading works.");
        first fr=new first();
        fr.start();
//        second se=new second();
//        se.start();
    }
}