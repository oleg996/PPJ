import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        double yf = 0;
        double xf = 0;
        double a = 0;
        double b = 0;
        double len =0;
        double z =1.5d;
    for (int x = 0 ;x<120;x++){
        for (int y = 0 ;y<320;y++){
            yf = (x/40d) - 1.5d; // the i part
            xf = (y/80d) - 2.5d;// the normal part
            xf = xf / z;
            yf = yf / z;
            a = 0;
            b = 0;
            int n = 0;
            for(int i =0;i<100;i++){
                double aa = a*a;
                double bb =b*b;
                double a2ab = 2d*(a*b);
                a = aa - bb + xf;
                b = a2ab + yf;
                len = aa+bb;
                    if (len>4d){
                        n = i;
                        break;
                    }
                    n = i;


            }
                    
        if (n>30){
            System.out.print("@");
        }
        else if (n>20){
            System.out.print("O");
        }else if (n>10){
            System.out.print(".");
        } else{
            System.out.print(" ");
        }
    }
    System.out.println(" ");
    }
}
}