public class DrzewoLisciaste
        extends Drzewo{
    private int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }


    public String toString() {
        return"DrzewoLisciaste "+"ksztaltLiscia "+ksztaltLiscia+" "+ super.toString();
    }
}
