/*
Program 3. WAP to create LinkedHashSet and perform following operations on
it
Case 1: add new element in LinkedHashSet
Case 2: view all elements from LinkedHashSet
Case 3: Search element from LinkedHashSet
Case 4: delete element from LinkedHashSet
 */

package com.LinkedHashSet.DriverApp;
import java.util.*;
import com.ClientLinkedHashSet.model.*;
public class LinkedHashSetClientApp {
    public static void main(String []args){
        RepositoryApp rp=null;
        Scanner sc=new Scanner (System.in);
        do{
            System.out.println("enter 1: add element in LinkedHashSet.");
            System.out.println("enter 2: view all element present in LinkedHashSet.");
            System.out.println("enter 3: search element from LinkedHashSet.");
            System.out.println("enter 4: Delete element from LinkedHashSet.");
            System.out.println("enter choice here:");
            int choice;
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    rp=new RepositoryApp();
                    rp.toAcceptInput();
                    break;
                case 2:
                    rp.showData();
                    break;
                case 3:
                    System.out.println("enter value here:");
                    int value;
                    value=sc.nextInt();
                    boolean result=rp.toCheakElement(value);
                    if(result){
                        System.out.println("Element present in LinkedHashSet.");
                    }
                    else{
                        System.out.println("Element not found in LinkedHashSet.");
                    }
                    break;
                case 4:
                    System.out.println("enter value here:");
                    int value1;
                    value1=sc.nextInt();
                    rp.deleteElement(value1);
                    break;
                default:System.out.println("Invalid Input.");
            }
        }while(true);
    }
}
