public class zad3 {
    public static void main(String[] args) {
       Donkey who = new Donkey(100);
  do{
      System.out.print('\r');
        who.addbaloon(10);

        System.out.println(who.getTotallift());
       }while (!who.isFlying());
           System.out.println("Ja latam!!!");
    }
}
