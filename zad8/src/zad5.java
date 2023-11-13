import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int numst = s.nextInt();
        int sum = 0 ;
         for(int i = 0 ; i <= numst;i++){

             sum += i;

        }
        System.out.println(sum);

    }
}
