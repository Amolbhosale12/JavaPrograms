// using lamda expression generate random number.
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier s=()->LocalDateTime.now();
        System.out.println("current date and time is :"+s.get());
    }
}