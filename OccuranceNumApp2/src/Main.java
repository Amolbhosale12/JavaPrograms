//write a program to create vector of size 10 and find occurance of every element
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vector ve=new Vector(); // vector array of size 10 (default)
        ve.add(10);
        ve.add(20);
        ve.add(30);
        ve.add(40);
        ve.add(10);
        ve.add(50);
        ve.add(89);
        ve.add(10);
        int count;
        // to find occurance of every element;
        for(int i=0;i<ve.size();i++){
            if((int)ve.get(i)==-1){
                continue;
            }
            count=1;
            for(int j=i+1;j<ve.size();j++){
                if((int)ve.get(i)==(int)ve.get(j)){
                    count++;                // if value is same then count increase by 1;
                    ve.set(j,-1);
                }
            }
            System.out.println((int)ve.get(i)+"="+count);
        }
    }
}