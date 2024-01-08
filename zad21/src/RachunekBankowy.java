public class RachunekBankowy {
    Osoba wlasciciel;
     double stan=1;

    public RachunekBankowy(Osoba wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    void wplata (double kwota) throws BlednaOperacja{
        if (kwota<0){
            throw new BlednaOperacja("Neg number");
        }
        else {
            stan=+ kwota;
        }
    }
    void wyplata(double kwota) throws BlednaOperacja{
        if (kwota<0){
            throw new BlednaOperacja("Neg number");
        }
        else if (kwota>stan){
            throw new BlednaOperacja("brak");
        } else {
            stan-= kwota;
        }

    }
    void przelew(RachunekBankowy rach, double kwota) throws BlednaOperacja{
        if (kwota<0){
            throw new BlednaOperacja("Neg number");
        }
        else if (kwota>stan){
            throw new BlednaOperacja("brak");
        } else {
            stan-= kwota;
            rach.wplata(kwota);
        }

    }

    public double getStan() {
        return stan;
    }

    @Override
    public String toString() {
        return "RachunekBankowy{" +
                "wlasciciel=" + wlasciciel.toString() +
                ", stan=" + stan +
                '}';
    }
    void aktualizacja() throws BlednaOperacja{
        System.out.println(this.toString());


    }
}
