import java.util.Arrays;

public class zad2 {

    public static void main(String[] args) {
        int[] a ={45,14,30,5};
        rbubstort(a,0,0);
        System.out.println(Arrays.toString(a));
    }
    public static void rbubstort(int[]a,int i,int inum){
        if(i ==  a.length-inum-1){
            if (inum == a.length-1){
                return;
            }else {
                rbubstort(a,0,inum+1);
            }

        }else {
            if (a[i] > a[i + 1]) {
                int tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
            }
            rbubstort(a, i + 1, inum);
        }
    }
}
