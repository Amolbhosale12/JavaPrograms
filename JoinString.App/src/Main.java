/*
write a program to concatenate two string.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        int flag=0;
        if(n1.length()==n2.length()){

            for(int i=0;i<n1.length();i++){
                int diff=n1.charAt(i)-n2.charAt(i);
                if(diff==0){
                    flag=0;
                }
                else{
                    flag=1;
                }

            }
            if(flag==1){
                System.out.println("not equal");

            }
            else{
                System.out.println("equal");
            }
        }
        else{
            System.out.println("not equal");
        }
    }
}