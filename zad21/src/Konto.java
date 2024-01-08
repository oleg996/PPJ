public class Konto extends  RachunekBankowy{
    private double oprocentowanie;
    public Konto(Osoba wlasciciel,double opr) {
        super(wlasciciel);
        oprocentowanie=opr;
    }

    @Override
    void wplata(double kwota) throws BlednaOperacja {
        super.wplata(kwota);
    }

    @Override
    void wyplata(double kwota) throws BlednaOperacja {
        super.wyplata(kwota);
    }

    @Override
    void przelew(RachunekBankowy rach, double kwota) throws BlednaOperacja {
        super.przelew(rach, kwota);
    }

    @Override
    public String toString() {
        return "Konto{" +
                "oprocentowanie=" + oprocentowanie +
                ","+super.toString()+
                '}';
    }

    @Override
    void aktualizacja() throws BlednaOperacja{

            super.wplata(super.getStan() * oprocentowanie);

        System.out.println(this.toString());
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }
}
