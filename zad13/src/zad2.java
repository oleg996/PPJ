public class zad2 {
    public static void main(String[] args) {
        int alen =(int)(Math.random()*10);
        int[] a  = new int[alen];
        fillwithrandom(a);
        int blen =(int)(Math.random()*10);
        int[] b  = new int[blen];
        fillwithrandom(b);
        int clen =(int)(Math.random()*10);
        int[] c  = new int[clen];
        fillwithrandom(c);

        int[][] fin = new int[3][];
        fin[0] = a;
        fin[1] = b;
        fin[2] = c;
        for (int i = 0; i < fin.length; i++) {
            for (int j = 0; j < fin[i].length; j++) {
                System.out.print(fin[i][j]+"_");
            }
            System.out.println();
        }
    }
    public static void fillwithrandom(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random()*10);
        }

    }
}
