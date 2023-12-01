public class zad3 {
    public static void main(String[] args) {
        int cos = 5;
        System.out.println("cos = "+cos);
        fun(cos);
        System.out.println("cos = "+cos);
    }
    public static void fun(int arg){
        System.out.println("fun (cos) = "+arg);
        arg = arg*5;
        System.out.println("fun (cos) = "+arg);

    }
}
