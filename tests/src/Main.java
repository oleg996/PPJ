public class Main {
   public static int[][] vram = new int[20][20];
    public static void main(String[] args) {

        while(true){
            print();
        }

    }
   public static void print(){
        for (int i = 0; i < vram.length; i++) {
            for (int j = 0; j < vram[i].length; j++) {
                if(vram[i][j] == 1){
                    System.out.print("*");
                }else System.out.print(" ");
                System.out.println();
            }
        }
    }
}