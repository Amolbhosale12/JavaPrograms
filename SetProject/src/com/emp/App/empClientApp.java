
/*
Program 1. WAP to create ArrayList and store 10 employee data in it and find
majority of employee who has same salary
A majority element in an array A[] of size n is an element that appears
more than n/2 times (and hence there is at most one such element).
Example: suppose you have 10 employee data in ArrayList and 6
employee has salary 10000 means we can say we have majority
element who having 10000 salary
 */
package com.emp.App;
import java.util.*;
import com.emp.model.Employee;
import com.emp.Repository.*;

public class empClientApp {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
                do{
            System.out.println("enter 1: add employee data.");
            System.out.println("enter 2: to show data of employee.");
            System.out.println("enter 3: to find majority employee who has same salary.");
            int choice;
            choice=sc.nextInt();
            EmpRepository er=new EmpRepository();;
            switch(choice){
                case 1:
                    er.toAcceptInput();
                    break;
                case 2: er.showData();
                    break;
                case 3:er.findMajoritySalary();
                    break;
                default: System.out.println("Invalid input");

            }
        }while(true);

    }
}









