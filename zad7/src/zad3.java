import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        switch (ch){
            case 'q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'-> System.out.println("spółgłoska");
            case 'e','y','u','a','i','o'-> System.out.println("samogłoska");
            default -> System.out.println("err");
        }

    }

}
