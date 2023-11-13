import java.util.Scanner;
import java.lang.Math;
public class zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float n1 = s.nextFloat();
        float n2 = s.nextFloat();
        System.out.println(Math.round(n1*100) == Math.round(n2*100)?"tak":"nie");
    }
}
