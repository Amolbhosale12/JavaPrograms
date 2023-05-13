//project voter.
import java.util.*;
class VoterError extends InputMismatchException{
    String displayError(){
        return "you can not vote";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age;
        age=sc.nextInt();
        try {
            if (age < 18 ) {
                VoterError ref = new VoterError();
                throw ref;
            } else {
                System.out.println("you can vote.");

            }
        }
        catch(VoterError ex){
            System.out.println(ex.displayError());

        }

    }
}