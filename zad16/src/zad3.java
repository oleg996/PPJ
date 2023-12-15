import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        int[][] tab = {{1,2,3},{4,5,6,},{7,8,9}};
        trans(tab);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }
    static public int[][] trans(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                swap(a,i,j);
            }
        }
        
        return a;
    }
    static public void swap(int[][]a,int i, int j){

        int tmp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = tmp;

    }
}
