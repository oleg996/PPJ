public class zad4 {
    public static void main(String[] args) {
        System.out.println(max(11,5,30));
    }
    public static int max(int a,int b,int c){
        if (a>b &&a>c){
            return a;
        }
        if (b>a &&b>c){
            return b;
        }
        return c;

    }
}
