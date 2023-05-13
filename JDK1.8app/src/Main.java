import java.util.*;
@FunctionalInterface
interface parent{
    default void tocalculate(){
        System.out.println("default method");
    }
    void show();
//    static void toshow(){
//        System.out.println("interface methods");
//    }
    //static void define(); //not possible to declare in interface .
}

class trial implements parent{

}
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        parent.toshow();
        parent pa=new trial();
        pa.tocalculate();

    }
}