import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        boolean run = true;
        int[][] dat = new int[0][];
        do {
            System.out.println("Enter (r)oll , (s)how or (e)xit");
            Scanner s = new Scanner(System.in);
            char ac = s.next().charAt(0);
            switch (ac){
                case ('r'):{
                   dat = roll(dat);
                    break;
                }
                case ('s'):{
                    show(dat);
                    break;
                }
                case ('e'):{
                    run =false;
                    break;
                } default:
                    System.out.println("enter again");

            }
        }while (run);
    }
    public static int[][] roll(int[][]a){

            int[][] tmp = a;
            a = new int[tmp.length + 1][2];
            for (int i = 0; i < a.length - 1; i++) {
                a[i][0] = tmp[i][0];
                a[i][1] = tmp[i][1];
            }
            a[a.length - 1][1] = (int) (Math.random() * 6) + 1;
            a[a.length - 1][0] = (int) (Math.random() * 6) + 1;


        return a;
    }
    public static void show(int[][]a){
        if (a.length == 0) System.out.println("no rols");
else {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i][1] + " AND " + a[i][0]);
            }
        }
    }
}
