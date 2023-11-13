import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt(); 
        System.out.println("The number "+ ((num%2 ==0) ? "is pair":"isnt pair"));

    }
}