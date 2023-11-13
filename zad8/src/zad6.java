import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        int l;
        do{
        Scanner s = new Scanner(System.in);
        System.out.println("ile pkt");
        float pkt = s.nextFloat();
        System.out.println("ile moz pkt");
        float mpkt = s.nextFloat();

        float per = (pkt / mpkt) * 100f;
        if (per > 87.1) {
            System.out.println("5");
        } else if (per > 81.25) {
            System.out.println("4.5");
        } else if (per > 75) {
            System.out.println("4");
        } else if (per > 62.6) {
            System.out.println("3.5");
        } else if (per > 50) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
            System.out.println("jeczhe raz 1/0");
            l = s.nextInt();
        }while (l == 1);
    }

    }

