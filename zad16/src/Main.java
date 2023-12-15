import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 int[] a ={45,14,30,5,50        };
 bubsort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void bubsort(int[]a){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i]>a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    sorted = false;
                }
            }
        }

    }
}