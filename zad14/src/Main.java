import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] [] tab = {{1,0,0,0,0},
                        {0,1,0,0},
                        {0,0,1}
        };
        int ou[]= new int[lengh(tab)];
        flaltten(tab,ou);
        System.out.println(Arrays.toString(ou));
    }
    public static int lengh(int[][]tab){
        int i = 0;
        for (int j = 0; j < tab.length; j++) {
            i += tab[j].length;
        }
        return i;
    }
    public static void flaltten(int[][]tab,int[] ou){

        int i = 1;
        for (int j = 0; j < tab.length; j++) {
            for (int k = 0; k < tab[j].length; k++) {
                ou[k+i-1] = tab[j][k];
            }
            i += tab[j].length;
        }

    }
}