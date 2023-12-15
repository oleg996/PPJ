import java.sql.Array;
import java.util.Arrays;

public class zad2
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString( tonum(0)));
    }
    public static int[] tonum(int a){
        int tmpa = a;
        int len = 0;
        do {
            tmpa /= 10;
            len++;

        }while (tmpa !=0);
        System.out.println(len);
        int [] nums = new int[len];
        int apos = len;
        len = 0;
        tmpa = a;
        do {
            nums[apos-len-1] = tmpa%10;
            tmpa /= 10;
            len++;

        }while (tmpa !=0);
        return nums;
    }
}
