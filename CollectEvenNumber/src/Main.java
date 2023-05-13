import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(40);
        ar.add(4);
        ar.add(5);
        ar.add(9);
        ar.add(50);
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        for (Integer I : ar) {
            if (I % 2 == 0) {
                ar1.add(I);
            }
        }
        System.out.println("these are the even number present in collection.");
        for (Integer a : ar1) {
            System.out.println(a);
        }

    }
}