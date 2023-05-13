// introduction of Map interface.
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        HashMap mp=new HashMap();
//        mp.put(1,'a');
//        mp.put(2,'b');
//        mp.put(3,04.f);
//        Set st=mp.keySet();
//        Iterator it=st.iterator();
//        while(it.hasNext()){
//            Object obj=it.next();
//            System.out.println(obj+" "+mp.get(obj));
//        }
        // if we want to remove data at key of 2 then how we can do that
        // as we know that in map interface remove method is there that method is
        // defined in  class like hashmap,linkHashMap,TreeMap
        // and we can use this method as our requirement
        // as we know that when we create object of that class in that object
        // no of methods are present as well in that class no of constructor is there
        // at the timing of creating object if we not pass any parameter then compiler
        // create memory block with 16 capacity and load factor is 0.75
        // how to remove data which is present in HashMap
        // hashMap
        // linkedHashMap
        // TreeMap

//        mp.put(4,"c");
//        mp.put(5,"d");
//        mp.put(6,"f");
//        mp.put(7,"e");
//        Set <Map.Entry> set=mp.entrySet();// this method used for retrive data in the form of key and values.
//           for(Map.Entry e:set){
//               System.out.println(e.getKey()+"="+e.getValue());
//           }
        HashMap<Integer, String> p = new HashMap<Integer, String>();
        p.put(1, "amol");
        p.put(2, "bhosale");
        p.put(3, "peaky");
        p.put(4, "blinder");
        p.put(5, "thomas");
        // we have two method to fetch data from
        // keySet();,entrySet();
        // to fetch data from HashMap using keySet(); method
//        Set<Integer> key=p.keySet();
//           for(Integer i:key){
//               System.out.println(i+"=>"+p.get(i));
//           }
//        }
        // using entrySet() method
        //Set <Map.Entry<Integer,String>> set=p.entrySet();
        for(Map.Entry<Integer,String> s:p.entrySet()){
            System.out.println(s.getKey()+"=>"+s.getValue());
        }

        // consider we have another collection that is LinkedHashMap
        // we have question is how we can store and fetch data from that collection
        LinkedHashMap<Integer,String> lhs=new LinkedHashMap<Integer,String>();
        lhs.put(1,"amol");
        lhs.put(2,"pramol");
        lhs.put(3,"ram");
        lhs.put(4,"raju");
        lhs.put(5,"shaym");
        lhs.entrySet();
        for(Map.Entry<Integer,String> l:lhs.entrySet()){
            System.out.println(l.getKey()+" "+l.getValue());
        }
        // we have another way to fetch data from user side.
        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
        lhm.put(1,1);
        lhm.put(2,2);
        lhm.put(3,3);
        lhm.put(4,4);
        lhm.put(5,4);
//        for(Map.Entry<Integer,Integer> me:lhm.entrySet()){
//            System.out.println(me.getKey()+" "+me.getValue());
//        }
        // merge into another collection.
        HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>(lhm);
        for(Map.Entry<Integer,Integer> data:hp.entrySet()){
            System.out.println(data.getKey()+"=>"+data.getValue());
        }

    }
}