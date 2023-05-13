package com.ClientApp;
import java.util.*;
import com.Student.model.*;
class ascedingOrder implements Comparator{
    public int compare(Object obj1,Object obj2){
        Student s1=(Student)obj1;
        Student s2=(Student)obj2;
        if(s1.getId()>s2.getId()){
            return 1;
        }
        else if(s1.getId()<s2.getId()){
            return -1;
        }
        else{
            return 0;
        }

    }

}
public class DriverApp {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList ar=new ArrayList();
        do{
            System.out.println("enter 1: input");
            System.out.println("enter 2: show data in ascending of id and fee");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter id,name and fee here:");
                    int id=sc.nextInt();
                    String name=sc.next();
                    int fee=sc.nextInt();
                    Student st=new Student(id,name,fee);
                    ar.add(st);
                    break;
                case 2:
                    for(Object obj:ar){
                        Student s=(Student)obj;
                        System.out.println(s.getId()+" "+s.getName()+" "+s.getFee());
                    }
                    break;
                default:System.out.println("Invalid input");



            }



        }while(true);

    }
}
