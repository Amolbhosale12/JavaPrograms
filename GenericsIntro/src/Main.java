import java.util.*;
/*
notation related about generics
E-generic element
T-generic type
v-generic value
K-generic key
 */
class Parent<E>{
    void show(int a) {
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> ar=new ArrayList<Integer>();
        // create object of generic class.
        Parent<Integer> pa=new Parent<Integer>();
        pa.show(3);
        pa.show(3);// here we will get error abc is a string but in object we can able
        // only Integer value according to above example.
        // as we know that when we create object of normal class we dont use generic
        // but if we use or if we want to store only integer value in class of object
        // then we have we need to apply generic so at the time of applying you should apply on both side class as well as object creation timing just like above example.
    }
}