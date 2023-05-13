
import java.util.*;
import java.lang.*;

class SortByIdAsWellAsSalary implements Comparator{
    public int  compare(Object obj1,Object obj2){
        Employee e1=(Employee)obj1;
        Employee e2=(Employee)obj2;

        if(e1.getId()>e2.getId()){
            return 1;
        }
        else if(e1.getSal()<e2.getSal()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
class Employee {
    private int id;
    private String name;
    private int sal;
    // override method which is declare in comparable interface.

    Employee(){
    }
    Employee(int id,String name,int sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList li=new ArrayList();
        li.add(new Employee(1,"amol",25000));
        li.add(new Employee(4,"pramol",30000));
        li.add(new Employee(3,"ram",10000));
        System.out.println("before sorting collection");
        Iterator i=li.iterator();
        while(i.hasNext()){
            Object obj=i.next();
            Employee e=(Employee)obj;
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
        }
        SortByIdAsWellAsSalary sr=new SortByIdAsWellAsSalary();
        Collections.sort(li,sr);
        System.out.println("after sorting collection");

        for(Object obj:li){
            Employee em=(Employee)obj;
            System.out.println(em.getId()+" "+em.getName()+" "+em.getSal());
        }
    }
}
