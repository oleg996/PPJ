import java.util.Scanner;
import java.lang.Math;
public class zad2 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        System.out.println("enter 1 num");
        float n1 = s.nextFloat();
        System.out.println("enter 2 num");
        float n2 = s.nextFloat();
        System.out.println("enter function");
        System.out.println("+,_,*,/,%,^,pow,rt");
        String fun = s.nextLine();

         fun = s.nextLine();

        double ou = switch (fun){
            case "+":
                yield(n1 + n2);
            case "-":
                yield(n1 - n2);
            case "*":
                yield(n1 * n2);
            case "/":
                yield(n2 != 0?  n1 / n2:0);
            case "pow":
                yield( Math.pow(n1,n2));
            case "rt":
                yield(Math.pow(n1,1/n2));
            default:
                yield (0);
        };
        System.out.println("Answer is "+ou);
    }
}