public class DrzewoIglaste
extends Drzewo{
    private int iloscIgiel;
    private double dlugscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugscSzyszki = dlugscSzyszki;
    }


    public String toString() {
        return "DrzewoIglaste" +" iloscIgiel="+iloscIgiel+" dlugscSzyszki="+dlugscSzyszki +" "+ super.toString();
    }
}
