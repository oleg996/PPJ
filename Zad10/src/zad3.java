import java.lang.Math;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        char ar[] = new char[10];
        Scanner s =new Scanner(System.in);
        char let[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','n','m','m'};
        int a = 'A';
        int z = 'Z';
        for (int i = 0 ; i<ar.length;i++){
           ar[i] = (char)((int)(Math.random()*25)+65);
            System.out.println(ar[i]);

        }
        boolean done = false;
while (!done){
    int am = 0;
    done = true;
    char c = s.next().charAt(0);
    for (int i = 0 ; i<ar.length;i++){
        if (ar[i]==c) {
            am++;
            ar[i]='0';
        }
        if (ar[i]!='0') {
            done = false;
        }

    }


    System.out.println(am);
}
    }
}
