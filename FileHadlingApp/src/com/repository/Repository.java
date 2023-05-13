package com.repository;

import java.util.*;
import java.io.*;

public class Repository {
    Scanner sc1=new Scanner(System.in);
    public void toCreateNewFile() {
        File f = new File("C:\\Users\\2288\\Desktop\\JAVA\\File Handling\\new\\file.txt");
        try {
            if (f.exists()) {
                System.out.println("file is present already.");

            } else {
                if (f.createNewFile()) {
                    System.out.println("file created successfully.");
                } else {
                    System.out.println("file not created.");
                }

            }

        } catch (Exception ex) {
            System.out.println("Errors is"+ex);
        }
    }
    public void toStoreData(){
        try{
            //File f=new File("C:\\Users\\2288\\Desktop\\JAVA\\File Handling\\new\\file1.txt");
            String n;
            System.out.println("enter String here:");
            n=sc1.nextLine();
            FileWriter fw=new FileWriter("C:\\Users\\2288\\Desktop\\JAVA\\File Handling\\new\\file.txt");
            fw.write(n);
            fw.close();// we need to close writing.
        }
        catch(Exception ex){
            System.out.println();
        }
    }
}
