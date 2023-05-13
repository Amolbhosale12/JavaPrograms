package com.ClientLinkedHashSet.model;
import java.util.*;

public class RepositoryApp {
    static LinkedHashSet lhs=new LinkedHashSet(); // Default capacity of LinkedHashSet is 16 and load factor 0.75
    Scanner sc=new Scanner(System.in);
    // accept input from user side.
    public void toAcceptInput(){
        System.out.println("enter Integer value here:");
        int value;
        value=sc.nextInt();
        lhs.add(value);
    }
    //view all elements from LinkedHashSet.
    public void showData(){
        Iterator it=lhs.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

    }
    // search Element from LinkedHashSet.
    public boolean toCheakElement(int value){
        boolean result=false;
            result=lhs.contains(value);
        return result;
    }
    // delete element from LinkedHashSet.

    public void deleteElement(int value){
       lhs.remove(value);
    }

}
