public class KontoVIP extends Konto{
    private double limitDebetu;
    private int przekroczenia= 0;
    public KontoVIP(Osoba wlasciciel, double opr,double deb) {
        super(wlasciciel, opr);
        limitDebetu = deb;

    }

    @Override
    void wplata(double kwota) throws BlednaOperacja {
        super.wplata(kwota);
    }

    @Override
    void wyplata(double kwota) throws BlednaOperacja {
        if (kwota<=0){

            throw new BlednaOperacja("neg numb");
        }
        else if (kwota>stan+limitDebetu){

            przekroczenia++;
            throw new BlednaOperacja("not enought");
        } else {
            stan=- kwota;
        }
    }

    @Override
    void przelew(RachunekBankowy rach, double kwota) throws BlednaOperacja {
        if (kwota<=0){
            throw new BlednaOperacja("Neg number");
        }
        else if (kwota>stan+limitDebetu){
            throw new BlednaOperacja("brak");
        } else {
            stan=- kwota;
            rach.wplata(kwota);
        }
    }

    @Override
    public String toString() {
        return "KontoVIP{" +
                "limitDebetu=" + limitDebetu +
                ", przekroczenia=" + przekroczenia +
                ", "+super.toString()+
                '}';
    }
    @Override
    void aktualizacja() throws BlednaOperacja {

            super.wplata(super.getStan() * super.getOprocentowanie());

        System.out.println(this.toString());
    }
}
