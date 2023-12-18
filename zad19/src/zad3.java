public class zad3 {
    public static void main(String[] args) {
    Rect plate = new Rect(10,10);
        System.out.println( plate.getSurf());

     Box Room = new Box(10,10,10);
        System.out.println( Room.getSurf());
        System.out.println(Room.getVol());

     Tria poli = new Tria(20);

        System.out.println(poli.getSurf());

     Prism opt = new Prism(20,10);

        System.out.println( opt.getSurf());
        System.out.println(opt.getVol());

    }
}
