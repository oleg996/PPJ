import java.util.Scanner;
import java.lang.Math;
public class zad0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        switch (n1%10){
          case 1 -> System.out.println(n1+"st");
          case 2 -> System.out.println(n1+"nd");
          case 3 -> System.out.println(n1+"rd");
          default -> System.out.println(n1+"th");
        }


    }
}