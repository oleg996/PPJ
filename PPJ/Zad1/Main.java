import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = input.nextInt(); 
         System.out.println("Enter second number");
        int num1 = input.nextInt(); 
        System.out.println("The number "+ ((num>num1) ? num:num1) + " is the bigest");

    }
}