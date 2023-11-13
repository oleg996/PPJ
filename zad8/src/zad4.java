import java.util.Scanner;
public class zad4 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num = 0;
        int am = 0;
        int sum = 0;
        num = s.nextInt();
        do{


                am++;
                sum += num;
            num = s.nextInt();

        }while (num !=0);
        System.out.println("Am " + am);
        System.out.println("Sum "+ sum);
    }

}
