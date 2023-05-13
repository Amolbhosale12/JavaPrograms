/*
store different type of data and fetch using consumer interface.
 */
import java.util.*;
import java.util.function.*;
class emp {
    private String name;
    private int id;
    private int salary;
    emp() {

    }
    emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    void setName() {
        this.name = name;
    }
    void setSalary() {
        this.salary = salary;
    }
    void setId() {
        this.id = id;
    }
    int getId() {
        return id;
    }
    int getSalary() {
        return salary;
    }
    String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        // create object of emp
        emp e1 = new emp(1, "amol", 25000);
        emp e2 = new emp(2, "pramol", 30000);
        emp e3 = new emp(3, "prasad", 45000);
        List<emp> li=new ArrayList();
        li.add(e1);
        li.add(e2);
        li.add(e3);

        //also we have another way to fetch data from collection
        // this is the simple way to fetch data from collection according to our requirement we can use.


//        for(int i=0;i<li.size();i++){
//           emp e =li.get(i);
//           System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
//        }

        for(emp ee1:li){
            System.out.println(ee1.getId()+" "+ee1.getSalary()+" "+ee1.getName());
        }
        //li.forEach((emp e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()));
        // forEach
    }
}