import java.lang.Math;
import  java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
     boolean haswon = false;
     int tries = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


while (!haswon) {
    System.out.println("enter sides");
    int num = (int) (Math.random()*100);

    tries++;
    if (a < b && b < 100) {
        if (a < num && num < b) {
            System.out.println("you win the num was " + num);

            haswon = true;
            break;


        }else {

            System.out.println("you failed the num was " + num);
            System.out.println(a+" "+b);
        }


    }
}
        System.out.println(" it took you "+tries +" tries");

    }
}
