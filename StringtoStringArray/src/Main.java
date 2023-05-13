import java.util.*;
public class Main {
    public static void main(String[] args) {

        String s="good";
        char newChar;
        System.out.println("Before conversion "+s);
        for(int i=0; i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') {
                // int val=((int)ch-32);
                newChar=(char)((int)ch-32);
                s=s.replace(ch, newChar);
            }
        }
        System.out.println("After Conversion "+s);

    }
}