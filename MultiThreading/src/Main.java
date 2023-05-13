/*
delay method according your requirement.

 */
class First extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("hello");
                sleep(5000);
            }

        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }
    }
}
class Second extends Thread{
    public void run(){
        try{
            for(int j=1;j<=5;j++){
                if(j==5) {

                }
                System.out.println("Amol");
                sleep(1000);
            }
        }
        catch(Exception ex){
            System.out.println("Error is"+ex);
        }


    }
}
public class Main {
    public static void main(String[] args) {
        // create object of class.
        First fr=new First();
        fr.start();
        Second se=new Second();
        se.start();
    }
}