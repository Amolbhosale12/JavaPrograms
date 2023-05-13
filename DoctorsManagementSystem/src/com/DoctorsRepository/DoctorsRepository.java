package com.DoctorsRepository;
import com.Doctors.model.*;
import java.util.*;
public class DoctorsRepository {
    Scanner sc1=new Scanner(System.in);
    static ArrayList ar=new ArrayList();
    Doctors D=null;// we have question is why we assign value null to us. ans is when we create in method we are not able to access outside
                   // of class but we need to access in another method so we can write as a instance user derived variable and assign value as a null.
    public void acceptInput(){
        int id;
        String name;
        int rank;
        String speciality;
        String city;
        int fees;
        System.out.println("enter doctor details according to id,name,rank,speciality,city,fees");  /*in this project we need input from user id,name,rank, speciality ,city, fees,*/
        id=sc1.nextInt();
        name=sc1.next();
        rank=sc1.nextInt();
        speciality=sc1.next();
        city=sc1.next();
        fees=sc1.nextInt();
        // here we create object of Doctors class and we can call parameterised constructor.
         D=new Doctors(id,name,rank,speciality,city,fees);
        ar.add(D);// by using this add function we can add all type of data which are present in doctors class store in arraylist collection.

    }
    // case 1: to show whatever store store in collection.
    public ArrayList show(){
        return ar;
    }
    // case 2: to search doctor by speciality.
    public Doctors searchBySpeciality(String speciality){
        Doctors d=null;
        boolean flag=false;
        for(int i=0;i<ar.size();i++){
             d=(Doctors)ar.get(i);
            if(d.getSpeciality().equals(speciality)){
                flag=true;
                break;
            }

        }
        if(flag){
            return d;
        }
        else{
            d=null;
            return d;
        }


    }
    // method for to search doctor by city.
    public Doctors searchByCity(String city){
        boolean flag=false;
        Doctors d=null;
        for(Object obj:ar){
            d=(Doctors)obj;
            if(d.getCity().equals(city)){
                flag=true;
                break;
            }

        }
        if(flag){
            return d;
        }
        else{
            d=null;
            return d;
        }

    }
    // this method use for to search by rank // we can pick up all object and compare this city name with that object
    // in that object all type of data store means derived data id Doctors.if rank is present then print all details of Doctors.
    public Doctors SearchByRank(int rank){
        boolean flag=false;
        Doctors d=null;
        for(Object obj:ar){
             d=(Doctors)obj;
            if(d.getRank()==rank){
                flag=true;
                break;
            }

        }
        if(flag){
            return d;
        }
        else{
            d=null;
            return d;
        }
    }
    // search doctor by low fees.
    public Doctors searchByLowFees(){
        int min;

        Doctors d=(Doctors)ar.get(0);//here we need to initialise the value so we can do like that
        min=d.getFees();
        Doctors dl=null;
        for(Object obj:ar){
            d=(Doctors)obj;
           if(d.getFees()<min){
               min=d.getFees();
               dl=d;
           }
        }

        return dl;
    }
    // search doctor by max fees
    public Doctors searchByMaxFees(){
        int max;
        Doctors d=(Doctors)ar.get(0);
        max=d.getFees();
        Doctors maxf=null;
        for(Object obj:ar){
            d=(Doctors)obj;
            if(d.getFees()>max){
                max=d.getFees();
                maxf=d;
            }
        }
        return maxf;
    }
    // delete doctor by id ;
    // means all information of doctor delete when we enter the id of that doctor.
    public void deleteById(int id){
        int index;
        for(int i=0;i<ar.size();i++){
            Doctors d=(Doctors)ar.get(i);
            if(d.getId()==id){
                index=ar.indexOf(d);
                ar.remove(index);
            }
        }
    }
    public void updateDoctorsById(int id,int rank){
        for(Object obj:ar){
            Doctors d=(Doctors)obj;
            if(d.getId()==id){
                d.setRank(rank);
            }

        }

    }
}

//int id,String name,int rank,String speciality,String city,int fees)