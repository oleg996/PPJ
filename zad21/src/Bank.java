public class Bank {
   private static RachunekBankowy[] tab={};

    static void przypiszRachunek(RachunekBankowy rachunek){

        RachunekBankowy[] tmp = tab;
        tab = new RachunekBankowy[tmp.length+1];
        for (int i = 0; i < tmp.length; i++) {
            tab[i] = tmp[i];
        }
        tab[tmp.length] = rachunek;
    }
   static void aktualizacja()throws BlednaOperacja{
        for (int i = 0; i < tab.length; i++) {
            tab[i].aktualizacja();
        }
    }

}
