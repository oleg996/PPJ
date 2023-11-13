import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int hei = s.nextInt();
        for (int x = 0 ;x<=len;x++){
        for (int y = 0; y<=hei;y++){

            System.out.print((x==0||x == len||y==0||y == len)?"#":".");
        }
            System.out.println("");
        }

    }
}
