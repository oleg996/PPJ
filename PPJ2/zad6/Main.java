
public class Main {
    public static void main(String[] args){
 int x = 4;
 long y = x * 4 - x++;
 if (y<12) System.out.println("za malo");
 else System.out.println("w sam raz");// bendie w sam raz bo x++ = 4 (++x = 5)
}
}
