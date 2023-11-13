import java.lang.Math;
public class zad4 {
    public static void main(String[] args) {
        int macierz[][] = new int[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (y == x) {
                    macierz[x][y] = (int) (Math.random() * 100);
                }else {
                macierz[x][y] = 0;}
            }
        }
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.print(macierz[x][y] + "  ");


            }
            System.out.println();
        }int sum =0;
        for (int x = 0; x < 10; x++) {

            sum+=  macierz[x][x];
        }
        System.out.println(sum);
    }
}
