import java.util.concurrent.TimeUnit;
public class Main {
   static int sizex = 51;
   static int sizey = 171;
   static int intensity = 5;
    static int[][] gram = new int[sizex][sizey];
    static int[][] grambuf = new int[sizex][sizey];
    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < intensity; i++) {
                int pos = (int) (Math.random() * sizey);
                gram[0][pos] = 1;
            }
            simulate();
            prit();
            clear();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
      static void prit(){
          String text ="";
          for (int i = 0; i < gram.length; i++) {

            for (int b = 0; b < gram[0].length; b++) {
                text = text+(gram[i][b] == 1?"*":" ");
            }
              text = text+'\n';

        }
          System.out.println(text);
    }
    static void simulate(){
        grambuf = new int[sizex][sizey];
        for (int i = 0; i < gram.length; i++) {
            for (int b = 0; b < gram[0].length; b++) {
                sim(i,b);
            }
        }
        gram = grambuf;
    }
    static  void sim(int xpos,int ypos) {
                if (gram[xpos][ypos] == 1) {
                    if (xpos != gram.length -1) {
                        if (gram[xpos + 1][ypos] != 1) {
                            grambuf[xpos + 1][ypos] = 1;
                        } else {
                            grambuf[xpos][ypos]=1;
                            }
                    } else {
                    grambuf[xpos][ypos] = 1;
                }
            }
        }
     static void clear (){
        boolean clear = true;
         for (int i = 0; i < sizey; i++) {
             if (gram[0][i] == 0) {
                 clear =false;
                 break;
             }
         }
         if(clear) gram = new int[sizex][sizey];
     }

    }


