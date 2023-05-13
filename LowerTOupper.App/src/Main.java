/*
write a program to convert lower case to uppercase string.
note :without using toUpperCase() method.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter string here:");
      //  String name=sc.nextLine();

        // if we want to convert string into char array at that time we have method that is toCharArray()
        // when we need to convert char array to string then how we can do solve.
        // when we convert we need to store variable to store data in the form of string
        // as we know than String is a class in that some methods are present
        // generally if we want to store in string we need to create String value to store that data
        // let consider below example
        // String name;

        // we can not change its value
        char ch[]={'a','b','c','d','e','f'};

       // String name=name1.copyValueOf(ch);
        String n=new String(ch);
        System.out.println(n);

    }
}