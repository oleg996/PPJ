public class zad3 {
    public static void main(String[] args) {


        Drzewo d = new Drzewo(true, 10, "dub");
        System.out.println(d.toString());
        DrzewoIglaste j = new DrzewoIglaste(true, 10, "a lot",100000,12.5);
        System.out.println(j.toString());
        DrzewoLisciaste l = new DrzewoLisciaste(false,1234,"1 cm",3);
        System.out.println(l.toString());
        DrzewoOwocowe o = new DrzewoOwocowe(false,13213,"med",2,"chery");
        System.out.println(o.toString());
    }
}
