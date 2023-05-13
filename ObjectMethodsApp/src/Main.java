/*
Object class and its methods.

 */

// as we know that when we create object of class and compares it they produces always different data present in object
// when we create object of class at time jvm generate hashcode different every time.if we compare that object
// always result is object is not equal. if we want to check each and every data present in class
// then we have Object Class with some methods like as boolean equals(Object) and int hashCode()
// we need to override that method in class or define logic in child class.
import java.util.*;
class A{
    int no;
    A(int a){
        this.no=a;
    }
}
class B{
    int no;
    B(int b){
        this.no=b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        A a=new A(10);
        B b=new B(10);
        System.out.println("hashcode of first object:"+System.identityHashCode(a));
        System.out.println("hashcode of second object:"+System.identityHashCode(b));
        if(a.equals(b)){
            System.out.println("both object are same.");
        }
        else{
            System.out.println("both object are different.");
        }
    }
}