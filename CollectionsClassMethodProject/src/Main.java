/*
lets revised methods of Collections
1) sort(collection reference)
2) sort(collection reference , reference of where we implement comparator )
3) reverse(collection reference)
4) max(collecion reference)
 Collections.sort(collection reference);
 Collections.sort(collection reference ,reference of where  we implement comparator);
 Collections.reverse(collection reference);
 Collections.max(collection reference);
 */
import java.util.Collections;
import java.util.*;
// below example of generics in java which is performed on normal class.
class A<E>{
    void show(E e,E a){
        System.out.println(e+" "+a);
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new A();
        a.show(10,"abc");


    }
}