/*
internal working of forEach method in collection.
 */
import java.util.function.*;
import java.util.*;
class MyConsumer implements Consumer{
    // here we need to define accept method which is present in consumer interface.
    public void accept(Object obj){
        System.out.println(obj);
    }
}

public class Main {
    public static void main(String[] args) {
        // create object of Consumer interface with the help of anonymous inner class.
        MyConsumer my=new MyConsumer();
        List <Integer> list=Arrays.asList(10,20,30,40,50);
        list.forEach(my);
    }
}