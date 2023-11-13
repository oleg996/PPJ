import java.util.Scanner;
import java.lang.Math;
public class zad6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
       float d = b*b - 4*a*c;
       if (d >0){
           System.out.println(((b *-1.) + Math.sqrt(d))/2.*a);
           System.out.println(((b *-1.) - Math.sqrt(d))/2.*a);

       }else if (d ==0){

           System.out.println((b*-1f)/2f*a);

       }else System.out.println("no roots");
    }
}