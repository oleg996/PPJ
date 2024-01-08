public class Spawacz
extends Osoba{
    int stazPracy = 0;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }
    public String print(){
       return
        super.print()+" "+stazPracy;
    }
}
