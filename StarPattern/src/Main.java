/*
problem on star pattern

*
  * *
 * * *
* * * *

 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 && j == 1) || j >= 4 - i && j <= 4 + i && j - i != 2 && i >= 2
                        && j - i != 0 && i - j != 2 && j - i != 4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}