/*
always remember that if we have functional interface means only one method present in
interface at that time we are able to create lamda expression or use lamda expression as
below example
lamda expression
 */

interface vehicle {
    void set();

    static void show() {
        System.out.println("static method");
    }
}

interface Parent {
    void counter();// abstract method
}

public class Main {
    public static void main(String[] args) {
        vehicle ve = () -> System.out.println("first interface.");
        ve.set();
        Parent pa = () -> {
            System.out.println("delay nearly about 2 sec:");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10000);
                } catch (Exception ex) {
                    System.out.println("Error is :" + ex);
                }
            }
        };
        pa.counter();
    }
}