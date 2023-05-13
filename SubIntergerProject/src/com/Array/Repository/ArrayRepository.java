package com.Array.Repository;
import java.util.*;
public class ArrayRepository {
    Scanner sc=new Scanner(System.in);
    static ArrayList ar=new ArrayList();
    public void toAcceptInput(){
        int num;
        System.out.println("enter number here:");
        num=sc.nextInt();
        ar.add(num);
    }
    public void showData(){
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
    public void findIndex(int sum){
        int sum1;
        int sum2;
        boolean flag=false;
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                sum1=((int)ar.get(i))+((int)ar.get(j));
                if(sum==sum1){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
