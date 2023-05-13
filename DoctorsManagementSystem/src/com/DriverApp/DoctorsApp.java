/*
Project 2:Doctors Management system.
case 1: add doctors details.//
case 2: display all details.//
case 3: search doctor by speciality.//
case 4: search doctor by city.//
case 5: search doctor by low fees.//
case 6: search doctor by max fees.//
case 7: search doctor by its rank.//
case 8: delete doctor by id.//
case 9: update rank of doctor using id.
 */
package com.DriverApp;
import com.Doctors.model.*;
import com.DoctorsRepository.*; // these are the package where we store input and logic of project.

import java.util.*;// all collection as well as scanner class is here:
public class DoctorsApp {
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter 1:Add doctors details.");
            System.out.println("enter 2:display all details of doctors");
            System.out.println("enter 3:search doctor by speciality");
            System.out.println("enter 4:search doctor by city.");
            System.out.println("enter 5:search doctor by low fees");
            System.out.println("enter 6:search doctor by max fees");
            System.out.println("enter 7:search doctor by its rank");
            System.out.println("enter 8:delete doctor by id.");
            System.out.println("enter 9:update doctor details");
            System.out.println("------------------------------------------");
            int choice;
            System.out.println("enter your choice here:");
            choice=sc.nextInt();
            DoctorsRepository dr=new DoctorsRepository();
            Doctors d=null;

            switch(choice){
                case 1:// to accept input from user which is written in another class that is DoctorsRepository class.
                    dr.acceptInput();
                    break;
                case 2:
                    ArrayList ar=dr.show();// this method return ArrayList collection where we store collection data.
                    for(Object obj:ar){
                         d=(Doctors)obj;
                        System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());
                    }
                    break;
                case 3:
                    // search by speciality
                    System.out.println("enter name of speciality");
                    String speciality=sc.next();
                    d=dr.searchBySpeciality(speciality);
                    if(d==null){
                        System.out.println("This type of speciality Doctor not found.");
                    }
                    else{
                        System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());
                    }
                    break;
                case 4:// we can choose this option to search by city.
                    System.out.println("enter city name here:");
                    String cname=sc.next();
                    d=dr.searchByCity(cname);
                    if(d==null){
                        System.out.println("you entered wrong city or there is a no any doctor at that place, please enter right city here");
                    }
                    else{
                        System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());
                    }
                    break;
                case 5://search doctor by low fees by using this choice we can easily find out low fee doctor.
                     d=dr.searchByLowFees();
                     System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());
                    break;
                case 6:
                    d=dr.searchByMaxFees();
                    System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());

                    break;
                case 7:System.out.println("enter rank here:");
                      int rank=sc.nextInt();
                      d=dr.SearchByRank(rank);
                      if(d==null) {
                          System.out.println("user entered wrong rank.please enter correct rank");
                      }
                      else{
                          System.out.println(d.getId()+" "+d.getName()+" "+d.getRank()+" "+d.getSpeciality()+" "+d.getCity()+" "+d.getFees());
                      }
                    break;
                case 8:
                     System.out.println("enter id here:");
                     int id=sc.nextInt();
                     dr.deleteById(id);
                     break;
                case 9:
                    System.out.println("enter id here and also enter what you want to change eg.rank");
                    int uid=sc.nextInt();
                    int urank=sc.nextInt();
                    dr.updateDoctorsById(uid,urank);
                    break;
                
                default:
                    System.out.println("Invalid input please enter proper input.");
            }
        }while(true);
    }
}
