import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature");
        double tempc = input.nextDouble();
        double tempf = (tempc*9/5)+32;
        System.out.println(tempf);

    }
}