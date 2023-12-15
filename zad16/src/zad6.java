public class zad6 {
    public static void main(String[] args) {
        Fruit[] frige = new Fruit[5];
        for (int i = 0; i < frige.length-1; i++) {
            frige[i] = new Fruit("apple");
        }
        frige[frige.length-1] = new Fruit("Orange");
        for (int i = 0; i < frige.length; i++) {
            frige[i].show();
        }
    }
}
