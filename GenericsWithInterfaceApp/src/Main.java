// here we learn how to apply generics to interface.
// as we know that we are able to apply generics to interface.
import java.util.*;
interface A<E> {
    void area(E e);
}
class SquareArea implements A<Integer>{
    public void area(Integer e){
        System.out.println("area of Square is:"+" "+e*e);
    }
}
class CircleArea implements A<Float>{
    public void area(Float e){
        System.out.println("area of Circle is:"+" "+3.14*e*e);
    }
}
public class Main {
    public static void main(String[] args) {
        // we can not create object interface but we are able to create reference of child. as follows
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 : To calculate area of square");
        System.out.println("Enter 2 : To calculate area of circle");
        System.out.println("enter your choice here:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                A ref=new SquareArea();
                System.out.println("Enter side value here:");
                int s=sc.nextInt();
                ref.area(s);// by using this line we calculate area of square by passing side value.
                break;
            case 2:
                System.out.println("Enter radius of circle here:");
                float r=sc.nextFloat();
                ref=new CircleArea();
                ref.area(r);// using this line we can calculate the area of circle by passing radius of circle.
                break;
            default:
                System.out.println("Invalid input from user side.");
        }


    }
}