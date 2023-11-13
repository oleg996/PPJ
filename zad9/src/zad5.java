import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = 10;
        int hei = 10;
        for (int x = 0; x <= len; x++) {
            for (int y = 0; y <= hei; y++) {
                if (x == 0) System.out.print(y + "  ");
                else if (y == 0) System.out.print(x+"  ");
                else {

                    System.out.print(x * y);
                    if (x * y < 10) System.out.print(" ");
                    if (x * y < 100) System.out.print(" ");
                }
            }


            System.out.println("");
        }

    }
}

