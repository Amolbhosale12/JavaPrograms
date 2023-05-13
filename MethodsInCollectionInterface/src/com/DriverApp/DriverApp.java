package com.DriverApp;
import com.ProductIn.model;
import com.ProductRepository.*;
/*
Project Title : Product Management System

case 1: Add New Product( id,name,price,company)
note: collection should not accept duplicate product name and company
case 2: View All Product
case 3: count total number of Product
case 4: display company wise product count
case 5: search product by name or by company or by id or by price
case 6: delete product by company name or id or by product name
case 7: find the product details in descending order by price
case 8: find second heighest price product details.
case 9 : display the company name who having maximum product count.
case 10:update price of product by company name and its product name.
 */
import java.util.*;
public class DriverApp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ProductInput pr=null;
        ProductRepository Repo=new ProductRepository();

        do{
            System.out.println("1:add new product");
            System.out.println("2:view all product");
            System.out.println("3:count total number of product");
            System.out.println("4:display company wise product count.");
            System.out.println("5:search product by name or by company or by id or by price");
            System.out.println("6:delete product by company name or id or by product name");
            System.out.println("7:find the product details in descending order by price");
            System.out.println("8:find second highest price product details");
            System.out.println("9:display the company name who having maximum product count");
            System.out.println("10:update price of product by company name and its product name");
            int choice;
            System.out.println("Enter the choice here");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter all details of product: id,name,price,company");
                    int id;
                    String name;
                    int price;
                    String company;
                    id=sc.nextInt();
                    name=sc.next();
                    price=sc.nextInt();
                    company=sc.next();
                    // here we create object of productInput.
                     pr=new ProductInput(id,name,price,company);
                    System.out.println("New product detail add successfully......");
                    break;
                case 2:
                    Repo.setInputInArrayList(pr);
                    Repo.show();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:System.out.println("Invalid input");

            }


        }while(true);

    }
}