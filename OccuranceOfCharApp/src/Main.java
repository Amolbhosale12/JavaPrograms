/*
write a program to count occurence of char in string.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string here:");
        String name=sc.nextLine();
        char name1[]=name.toCharArray();
        int count;

        for(int i=0;i<name1.length;i++){
            if(name1[i]==1 || name1[i]==' '){
                continue;
            }
            count=1;
            for(int j=i+1;j<name1.length;j++){
                if(name1[i]==name1[j]){
                    name1[j]=1;
                    count++;
                }

            }
            System.out.println(name1[i]+"=>"+count);

        }

    }
}