import java.util.*;
interface ArrayOperation{
    int acceptArray(int a[]);

}
class CheckDuplicate implements ArrayOperation{
    int flag=0;
    public int  acceptArray(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    flag=1;
                }

            }
        }
        return flag;
    }

}
class CountDuplicate implements ArrayOperation{
    int count;
    int a[]=new int[6];
    public int acceptArray(int[] a) {
        a=a;
       return 1;
    }
    void toShow(int a[]){
        for(int i=0;i<a.length;i++){
            count=1;
            if(a[i]==-1){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(count>=2){
                System.out.println(a[i]+"=> "+count);
            }

        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("enter all 6 elements:");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        // here we create reference of parent and object of child class.
        ArrayOperation ref=new CheckDuplicate();
        int result=ref.acceptArray(a);
        ref=new CountDuplicate();
        int count=ref.acceptArray(a);
        CountDuplicate cd=new CountDuplicate();
        if(result==1){
            System.out.println("Duplicate value present.");
        }
        else{
            System.out.println("Duplicate value is not present.");
        }
        System.out.println("Duplicate value and its count:");
        cd.toShow(a);
    }
}