import java.util.Scanner;

public class zad4t {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int hei = s.nextInt();
         int dt=0;
        for (int x = 0 ;x<=len;x++){
        for (int y = 0; y<=hei;y++){
        dt = (int) ((((float)(hei-x)/(float)hei )*(float)len)/2);
            System.out.print((x == len||y==dt||y == len-dt)?"#":" ");
        }
            System.out.println(" ");
        }

    }
}
