/*
Program 2. WAP to create ArrayList with 10 values of type integer and find
sum of given value.
Given an array arr[] of non-negative integers and an integer sum, find a
subarray that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum,
print first such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 =
33
 */
package com.subArrayClientApp;
import com.Array.model.*;
import com.Array.Repository.*;
import java.util.*;

public class SubArrayClientApp {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayRepository Ar=null;
        do{
            System.out.println("enter 1: for adding integer value in arrayList.");
            System.out.println("enter 2: for showing data which are present in arrayList.");
            System.out.println("enter 3: enter here sum.");
            int choice;
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    Ar=new ArrayRepository();
                    Ar.toAcceptInput();
                    break;
                case 2:
                    Ar.showData();
                    break;
                case 3:int sum;
                    System.out.println("enter value here:");
                    sum=sc.nextInt();
                    Ar.findIndex(sum);
                    break;
                default: System.out.println("Invalid input from user side.please enter proper input.");

            }

        }while(true);
    }
}
