public class Main {
    public static void main(String[] args) {
        int dzien = 12;
        int mies = 1;
int olday = 0;
        for (int mo = 1 ; mo<mies;mo++){
            switch (mo){
                case 1,3,5,7,8,10,12 :{
                olday += 31;
                    break;
                }
                case 2 :
                    olday += 29;
                    break;

                case 4,6,9,11 :
                    olday += 30;
                    break;




            }



        }
        olday += dzien;
        System.out.println(olday);

    }
}