// when ArrayIndexOutOfBoundException occur.
// as we know that when we fetch data more than size of array at that time generate error.
import java.lang.Throwable;
public class Main {
    public static void main(String[] args) {
        int a[]=new int[]{4,5,4,3,5};
        try{
            System.out.println(a[9]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("please enter index less than size of array.");
        }

    }
}