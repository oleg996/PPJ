public class Main {
    public static void main(String[] args) {
    Cart crt = new Cart("oleg");

    crt.addProduct("apple",0.9);
    crt.addProduct(new Product("banana",1));
    crt.print();
    }
}