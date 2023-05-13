/*
write a class named as ArrayRotate with a constructor and a method use parameterized constructor
to set array and a method named as void RotateArray() to rotate array element kth time.
 */
import java.util.*;
class ArrayRotate{
    Scanner sc=new Scanner(System.in);
    int array[];
    ArrayRotate(int array[]){
        this.array=array;

    }
    void RotateArray(){
        System.out.println("enter kth value here:");
        int k=sc.nextInt();
        // 1 2 3 4 5 => 2 3 4 5 1
        // take temp array with same size.
        int s=array.length;
        int temp[]=new int[s];
        int j=0;
        for(int i=k;i<array.length;i++){
            temp[j]=array[i];
            j++;
        }
        for(int i=0;i<k;i++){
            temp[j]=array[i];
            j++;
        }
        System.out.println("after rotating array of kth times.");
//        for(int i=0;i<temp.length;i++){
//            System.out.println(temp[i]);
//        }
        array=temp;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter all values here:");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        // create object of above class.
        ArrayRotate ref=new ArrayRotate(a);
        ref.RotateArray();

    }
}