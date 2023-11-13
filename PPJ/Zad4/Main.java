import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        if (num<=-10){
            System.out.println("(-∞,-10]");
        }
        if (num>-15 && num<5){
            System.out.println("(-15,5)");
        }
        if (num>=-5 && num<=10){
            System.out.println("[-5,10]");
        }
           if (num>10){
            System.out.println("(10,∞)");
        }
    


    }
}
