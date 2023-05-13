import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array here:");
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        // LinkedHashHap
        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
        int count;
        for(int i=0;i<array.length;i++){
            count=1;
            if(array[i]==-1){
                continue;
            }
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    array[j]=-1;
                }
            }
            lhm.put(array[i],count);
        }
        // to display occurance here:
        for(Map.Entry<Integer,Integer> mp:lhm.entrySet()){
            System.out.println(mp.getKey()+"=>"+mp.getValue());
        }
    }
}