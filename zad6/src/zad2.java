import  java.util.Scanner;
import java.lang.Math;
public class zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter action");
        System.out.println("1 -> + ");
        System.out.println("2 -> - ");
        System.out.println("3 -> * ");
        System.out.println("4 -> / ");
        System.out.println("5 -> div left ");
        System.out.println("6 -> power");
        System.out.println("7 -> root");
        int po = s.nextInt();
        if (po <=7 && po >0) {
            System.out.println("Enter 1st number");
            double n1 = s.nextDouble();
            System.out.println("Enter 2nd number");

            int n2 = s.nextInt();
            System.out.print("Answer ");
            if (po == 1) {
                System.out.println(n1 + n2);
            } else if (po == 2) {
                System.out.println(n1 - n2);
            } else if (po == 3) {
                System.out.println(n1 * n2);
            } else if (po == 4) {
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("NO!!");
                }
            } else if (po == 5) {
                if (n2 != 0) {
                    System.out.println(n1 % n2);
                } else {
                    System.out.println("NO!!");
                }
            } else if (po == 6) {
                System.out.println(Math.pow(n1, n2));
            } else if (po == 7) {
                System.out.println(Math.pow(n1, 1. / n2));
            }
        }else {
            System.out.println("something wrong");
        }
    }
}