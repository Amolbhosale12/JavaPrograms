/*
Write a program to create file name as a data.txt and store data in it using BufferedReader
class and every data should on new line.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
         {
        Scanner sc=new Scanner(System.in);
        // create file of data.txt
//        File f=new File("C:\\Users\\2288\\Desktop\\JAVA\\File Handling\\new.txt");
//        // boolean result=f.createNewFile(); Yes we can make like that but we try to make file using fileWriter
//        System.out.println("Enter string here:");
//        String data=sc.nextLine();
//        FileWriter fw=new FileWriter(f,true);
//        BufferedWriter bf=new BufferedWriter(fw);
//        fw.write(data);
//        bf.newLine();
//        bf.close();
//        fw.close();
//        System.out.println("successfully");
        // take input from user and store in that class file.
        //how to read data from this class file
        FileReader fr=new FileReader("C:\\Users\\2288\\Desktop\\JAVA\\File Handling\\new.txt");
        BufferedReader br=new BufferedReader(fr);
        String d;
        try{
            while((d=br.readLine())!=null){
                System.out.println(d);// typecasting ascii to char conversion
                Thread.sleep(2000);
            }

        }
        catch(Exception ex){
            System.out.println("Error is:"+ex);

        }

    }
}



