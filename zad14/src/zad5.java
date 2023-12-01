import java.sql.Array;
import java.util.Arrays;

public class zad5 {
    public static void main(String[] args) {
        int[] a = randAr((int)(Math.random()*10)+10);
        int[] b = randAr((int)(Math.random()*10)+5);

        System.out.println(Arrays.toString(fun(a,b,-1000)));
    }
    public static int[] randAr(int lengh){
        int[] ar = new int[lengh];
        for (int i = 0; i < lengh; i++) {
            ar[i] = (int) (Math.random()*100);
        }
        return ar;
    }
    public static int[] fun(int[] a,int[] b,int arg){

        if (a.length != b.length) {
            int[] ou;
            if (arg < 0 ) {
                int len = Math.min(a.length, b.length);
                ou = new int[len];
                for (int i = 0; i < len; i++) {
                    ou[i] = a[i] + b[i];
                }
                return ou;


            }else if (arg>0){
                if (a.length> b.length) {
                    int len = a.length- b.length;
                     ou = new int[len];
                    for (int i = 0; i < len; i++) {
                        ou[i] = a[b.length+i];
                    }
                    return ou;
                }else  {
                    int len = b.length- a.length;
                    ou = new int[len];
                    for (int j = 0; j < len; j++) {
                        ou[j] = a[a.length+j];
                    }
                    return ou;
                }

            }
        }
        return null;
    }
    }
    
