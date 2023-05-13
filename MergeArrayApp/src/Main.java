/*
write a program to two vector of size 5 and merge into third array.

 */
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        //first vector array.
        Vector v1=new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        // second vector array.
        Vector v2=new Vector();
        v2.add(60);
        v2.add(70);
        v2.add(80);
        v2.add(90);
        v2.add(100);
        // third vector array.
        Vector v3=new Vector();
        for(int i=0;i<v1.size();i++){
            v3.set(i,(int)v1.get(i));
        }
        for(int i=0;i<v2.size();i++){
            int t=i+v1.size();
            v3.set(t,(int)v2.get(i));
        }
        System.out.println("after merging two vector array in single array.");
        for(int i=0;i<v3.size();i++){
            System.out.println((int)v3.get(i));
        }
    }
}