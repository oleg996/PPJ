public class zad2 {
    public static void main(String[] args) {
        int tabtr = 0;
        int tabfl = 0;
        boolean tab [] = {false,true,false,true,true,true,false};
        for(int i =0;i<tab.length;i++){
            if (tab[i])tabtr++;
            else tabfl++;


        }
        boolean artr[] = new boolean[tabtr];
        boolean arfl[] = new boolean[tabfl];
        System.out.println("trues "+ tabtr+" falses "+tabfl );
    }
}
