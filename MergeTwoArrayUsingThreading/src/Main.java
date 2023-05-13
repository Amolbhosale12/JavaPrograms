/*
create two thread name as first and second as well as create one more class as resource
class name as mergeArray and pass five size array from first thread and pass five size
array from second thread and merge them in MergeArray using asynchronization technique.
 */
import java.util.*;
import java.lang.*;// default package present in java so do not need to import that package explicitly.

class SetArray{
    int i=0;
    static ArrayList<Integer> Ar=new ArrayList<Integer>();
    int a[];
    int b[];

    void setFirst(int a[]){
        this.a=a;
    }
    int[] getArray1(){
        return a;
    }
    void setSecond(int b[]){
        this.b=b;
    }
    int[] getArray2(){
        return b;
    }
    void toSetData(int a){
        Ar.add(a);
    }
    void displayMergingArray(){
        for(int i=0;i<Ar.size();i++){
            Object d=(Object)Ar.get(i);
            System.out.println(d);
        }
    }
}
class First extends Thread{
    // create object that input class.
    SetArray sa=null;
    int a1[];
    void toAcceptInput(SetArray sa){
        this.a1=sa.getArray1();
        this.sa=sa;
    }
    // merging logic
    public  void run(){
        try{
            for(int i=0;i<a1.length;i++){
                sa.toSetData(a1[i]);
            }

        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }
    }

}

class Second extends Thread{
    // create object that input class.
    SetArray sa=null;
    int b1[];
    void toAcceptInput(SetArray sa){
        this.b1=sa.getArray2();
        this.sa=sa;
    }
    // merging logic
    public void run(){
        try{
            for(int i=0;i<b1.length;i++){
                sa.toSetData(b1[i]);
            }

        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int a1[];
        int b1[];
        System.out.println("enter first array here:");
        for(int j=0;j<5;j++){
            a[j]=sc.nextInt();
        }
        System.out.println("enter second array here:");
        for(int j=0;j<5;j++){
            b[j]=sc.nextInt();
        }
        // create object of SetArray
        SetArray sa=new SetArray();
        sa.setFirst(a);
        sa.setSecond(b);

        // create object of first thread
        First fr=new First();
        fr.toAcceptInput(sa);
        // create object of second thread
        Second se=new Second();
        se.toAcceptInput(sa);
        fr.start();
        se.start();
        sa.displayMergingArray();

    }
}
//    void mergeTwoArray(int a[],int b[]){
//        int l1=a.length;
//        int l2=b.length;
//        int l[]=new int[l1+l2];
//        for(int i=0;i<a.length;i++){
//            l[i]=a[i];
//        }
//        // to copy second array into third array using below loop.
//        for(int i=0;i<b.length;i++){
//            l[a.length+i]=b[i];
//        }
//        // to display third array after merging
//        for(int i=0;i<l.length;i++){
//            System.out.print(l[i]);
//        }
//    }