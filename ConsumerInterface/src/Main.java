/*
 * Consumer interface
 * if you want to achieve Consumer interface then we have three way
 * 1) in user defined class implement Consumer interface
 * 2) using anonymous inner class
 * 3) by using lamda expression or lamda function.
 * */

// here we study about how to implement Consumer interface
// as we know that when we implement any interface we need to define what every abstract
// method present in interface
// so consider for Consumer interface in that void accept(Object obj) method is there so we need to define
// in implementor class.
// when you can doing programming we need to know about some shortcut keys like
// alt+ctrl+o for to delete unwanted packages which are present in program
// alt+ctrl+l for to format your program so, we can easily read.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

class MyConsumer implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println("below are the data which are present in ArrayList. ");
        System.out.println(o);
    }
}

class MyConsumer1 implements Consumer {
    public void accept(Object o) {

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take any collection according to your choice
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        // here we create object of MyConsumer classs
        MyConsumer mc = new MyConsumer();
        mc.accept(ar);
    }
}