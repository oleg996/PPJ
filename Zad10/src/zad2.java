import java.lang.Math;
public class zad2 {
    public static void main(String[] args) {
        char ar[] = {'a','f','t','d','e'};

        int hie = 0;
        int hii =0;
        for (int i = 0 ; i<ar.length;i++){
            if (ar[i]>hie) {
                hie =ar[i];
                hii = i;
            }

        }
        System.out.println("the largest letter was "+ar[hii]+" it is № "+hii);
    }
}
