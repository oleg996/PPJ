public class Main {
    public static void main(String[] args) {
//zad 1
        System.out.println("zad 1");
 Rect cw = new Rect(10);
 cw.show();
        System.out.println();
 //zad 2
        System.out.println("zad 2");
Cylinder cu = new  Cylinder(2,2);
cu.show();
        System.out.println();
//zad 3
        System.out.println("zad 3");
SphereIN spou = new SphereIN(cw);
spou.show();
        System.out.println();
spou = new SphereIN(cu);
spou.show();
        System.out.println();
//zad4
        System.out.println("zad 4");
SphereOUT spin = new SphereOUT(cw);
spin.show();
        System.out.println();
spin = new SphereOUT(cu);
spin.show();





    }
}