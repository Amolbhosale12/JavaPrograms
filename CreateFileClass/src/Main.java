import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // here we need to create file class
        // always remember that when we need to create class file that time we need to
        // handle IOException
        // direct apply throws IOException on method like public static void main(String[] args) throws IOException {}
        // resolve this exception problem we have two way above one and below one.
        // use what ever you want.
        // this type of exception means IOException happen while creating a class file
        // there is no exception created while creating another folder by using mkdir() method
        // which is present in File class
        // as we know that no of method which are present in File class use according your requirement
        try{
            File f=new File("C:\\Users\\2288\\Desktop\\amol\\amolew.txt");
            boolean result=f.createNewFile();
            if(result){
                System.out.println("created successfully...");
            }
            else{
                System.out.println("already present...");
            }
        }
        catch(Exception ex){
            System.out.println("Error is"+"="+ex);
        }
    }
}