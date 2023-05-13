package com.emp.Repository;
import java.util.*;
import com.emp.model.*;

public class EmpRepository {
    Scanner sc=new Scanner(System.in);
      static ArrayList ar=new ArrayList();
      static ArrayList a=new ArrayList();
      public void toAcceptInput(){
          System.out.println("enter id ,name and salary here:");
          int id=sc.nextInt();
          String name=sc.next();
          int sal=sc.nextInt();
          Employee emp=new Employee(id,name,sal);
          ar.add(emp);
      }
      public void showData(){
          for(Object obj:ar){
              Employee em=(Employee)obj;
              System.out.println(em.getId()+" "+em.getName()+" "+em.getSal());
          }
      }
      public void findMajoritySalary(){

          a.add(ar);
          int max=0;
          int count;
          Employee p=null;
          for(int i=0;i<ar.size();i++){
              if((((Employee)ar.get(i)).getSal())==-1){
                  continue;
              }
              count=1;
              for(int j=i+1;j<ar.size();j++){
//                  Employee prev=((Employee)a.get(i));
//                  Employee next=((Employee)a.get(j));
                  if(((Employee)ar.get(i)).getSal()==((Employee)ar.get(j)).getSal()){
                      count++;
                      ((Employee)ar.get(j)).setSal(-1);

                  }
              }
              if(count>max){
                  max=count;
                    p=(Employee)ar.get(i);
              }
          }
          if(max>(ar.size()/2)){
              System.out.println("majority of employee who has same salary");
              System.out.println(p.getSal());
          }
          else{
              System.out.println("no majority of employee who has same salary");
          }
          ar.add(a);

      }
}
