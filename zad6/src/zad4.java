import  java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Jake imje");
        String nam = s.nextLine();
        System.out.println("pore dnia");
        System.out.println("1 -- rano");
        System.out.println("2 -- popoludnie");
        System.out.println("3 -- wiechor");
        int pora = s.nextInt();

        System.out.println("jenzyk");
        System.out.println("1 -- angelski");
        System.out.println("2 -- polski");

        int jen = s.nextInt();
        if(pora<=3&& jen <=2 && pora > 0 && jen > 0) {
            if (pora == 1) {
                System.out.print((jen == 2) ? "dobrego ranky" : "good morning");
            } else if (pora == 2) {
                System.out.print((jen == 2) ? "dobrego dnia" : "good afternoon");
            } else if (pora == 3) {
                System.out.print((jen == 2) ? "dobrego wiecora" : "good evening");
            }
            System.out.println(" " + nam);
        }
        else {
            System.out.println("Cos ne tak");
        }


    }
}