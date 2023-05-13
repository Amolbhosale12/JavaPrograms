// if you want some information about system. like how much are present in system
// and total space  and free space like that you can you classes which are present in java.io
//like File class.
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File a[]=File.listRoots();
        for(int i=0;i<a.length;i++){
            long totalSpace=a[i].getTotalSpace();
            System.out.println(a[i]+"="+(totalSpace/1073741824)+"GB");
        }
    }
}