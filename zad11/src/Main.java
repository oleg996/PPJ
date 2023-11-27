public class Main {
    public static void main(String[] args) {
        int tab [] = {1,2,3,4,4,3,2,1};
        boolean symetry = true;
        for (int i =0;i<tab.length;i++){
            if (tab[i]  !=    tab[tab.length -  i-1]){
            symetry = false;

            }

        }
        System.out.println(symetry);
    }
}