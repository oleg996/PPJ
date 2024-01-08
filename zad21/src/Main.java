public class Main {
    public static void main(String[] args) {
KontoVIP myrach = new KontoVIP(new Osoba("Oleh",20),100,-10);

try {
    myrach.wplata(10);
}catch (Exception e){
    System.out.println(e);
}
        try {
            myrach.wyplata(20);
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            myrach.aktualizacja();
        }
        catch (Exception e){
            System.out.println(e);
        }

        Bank.przypiszRachunek(new Konto(new Osoba("Bartek",34),-100));
        Bank.przypiszRachunek(new RachunekBankowy(new Osoba("Ssdf",99999)));
        try {
            Bank.aktualizacja();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}