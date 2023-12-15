public class Main {
    public static void main(String[] args) {
        int[][] a = {{10,20,30},{10,20,30}};
        int[][] b = {{10,20,30},{10,20,30}};
        int[][] c = {{10,20},{10,20,30},{}};
        System.out.println(jestRowna(a,c));
    }
    public static boolean jestRowna(int[][] a,int[][] b){
        if(a.length != b.length)     return false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (a[i][j] != b[i][j] || a[i].length != b[i].length){
                    return false;
                }
            }
        }
        return true;

    }
}