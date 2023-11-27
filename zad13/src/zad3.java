public class zad3 {
    public static void main(String[] args) {
        float[][] mat =  new float[8][8];
        fillwithrandom(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+"_");
            }
            System.out.println();
        }
        float suml = 0;
        for (int i = 0; i < 8; i++) {
            suml += mat[i][i];
        }
        System.out.println(suml);
        float sumr = 0;
        for (int i = 0; i < 8; i++) {
            suml += mat[i][7-i];
        }
        System.out.println(suml);
    }
    public static void fillwithrandom(float[][] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = (float)Math.random()*10;
            }
        }

    }
}
