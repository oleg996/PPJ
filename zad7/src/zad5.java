import java.util.Scanner;
import java.lang.Math;
public class zad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a1 = s.nextFloat();
        float a2 = s.nextFloat();
        float a3 = s.nextFloat();
        if (a1 <= 0 ||a2 <= 0|| a3 <= 0) System.out.println("this snt a tia");
        else {
            if (a1 + a2 + a3 == 180) {
                System.out.println("the triange is enc");
                if (a1 < 90 && a2 < 90 && a3 < 90) System.out.println("the thiangle is sharp");
            } else System.out.println("the triange is't enc");

        }
    }
}
