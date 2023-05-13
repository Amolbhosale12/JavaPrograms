// here we discuss about how to create folder at run time.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f=new File("C:\\Users\\2288\\Desktop\\amol");
        boolean result=f.mkdir();
        if(result){
            System.out.println("successfully created.");
        }
        else{
            System.out.println("already present.");
        }
//        boolean result=f.exists();
//        if(result){
//            System.out.println("already present in drive");
//        }
//        else{
//            System.out.println("successfully created....");
//        }
    }
}