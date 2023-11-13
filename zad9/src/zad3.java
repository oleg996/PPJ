import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
long num = s.nextLong();
long diw = 1;

do{

 diw++;

}while (num % diw != 0);
        System.out.println("the "+num+" is dw by " +diw);
        if (num == diw){
            System.out.println("the "+num+" is prime");

        }
    }
}
