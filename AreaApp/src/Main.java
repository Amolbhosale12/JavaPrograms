
/*
write a program to create interface area
 interface are{
 public void dimensions();
 public void area();
 }
 implement it in another class interfaceApp and calculate area of circle ,rectangle,triangle and
 Square use switch case to create menu driven program.
 */
import java.util.*;
interface Area{
    void dimensions();
    void area();
}
class Circle implements Area{
    int rad;

    public void dimensions(){
        this.rad=rad;
        System.out.println("Enter radius here:");
        Scanner sc=new Scanner(System.in);
        rad=sc.nextInt();
    }
    public void area(){
        float PI=3.15f;
       float areac=PI*rad*rad;
       System.out.println("Area of circle is:"+areac);
    }
}
class Rectangle implements Area{
    int h;
    int w;
    public void dimensions(){
        System.out.println("Enter height and width respectively.");
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        w=sc.nextInt();
    }
    public void area(){
        int arear;
        arear=h*w;
        System.out.println("Area of rectangle is:"+arear);
    }

}
class Triangle implements Area{
    int h;
    int b;
    public void dimensions(){
        System.out.println("Enter base and height respectively");
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        h=sc.nextInt();
    }
    public void area(){
        float areat;
        areat=1/2*b*h;
        System.out.println("Area of triangle is:"+areat);
    }

}
class Square implements Area{
    int side;
    public void dimensions(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side value of square:");
        side=sc.nextInt();
    }
    public void area(){
        int areas;
        areas=side*side;
        System.out.println("Area of square is :"+areas);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Circle.");
        System.out.println("Enter 2 for Rectangle.");
        System.out.println("Enter 3 for Triangle.");
        System.out.println("Enter 4 for Square.");
        System.out.println("Enter the choice here:");
        int choice;
        choice=sc.nextInt();
        switch(choice){
            case 1:  Area ref=new Circle();
                     ref.dimensions();
                     ref.area();
                break;
            case 2:  ref=new Rectangle();
                     ref.dimensions();
                     ref.area();
                break;
            case 3:  ref=new Triangle();
                     ref.dimensions();
                     ref.area();
                break;
            case 4:  ref=new Square();
                     ref.dimensions();
                     ref.area();
                break;
            default:System.out.println("Invalid input.");
        }

    }
}