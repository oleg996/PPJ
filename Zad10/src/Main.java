import java.lang.Math;
public class Main {
    public static void main(String[] args) {
     double ar[] = new double[10];
        System.out.println("array init");
     for (int i = 0;i<ar.length;i++){
        ar[i] = Math.random()*100;


     }
        System.out.println("array elements");
        for (int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);



        }
        System.out.println("array elements with pair in");
        for (int i = 0;i < ar.length;i+=2){
            System.out.println(ar[i]);



        }
        System.out.println("pair array elements");
        for (int i = 0;i<ar.length;i++){
            if ((int)ar[i]%2==0) {
                System.out.println(ar[i]);
            }


        }
    }
}