public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 11; j++) {
                if ((i==1 && j==1)||(i==1 && j==7)) {
                    System.out.print("* ");
                }
                else if((j>=1 && j<=3 && i==2) ||(i==2 && j>=7 && j<=9)){
                    System.out.print("* ");
                }
                else if(i==3 && j!=6){
                    System.out.print("* ");
                }
                else if (i == 4) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}