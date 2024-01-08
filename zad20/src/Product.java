public class Product {
    private String name;
    private double price;
    private Cart cart;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price,Cart cart) {
        this.name = name;
        this.price = price;
        this.cart = cart;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.cart = null;
    }

    public void addToShoppingCart(Cart cart) {
        this.cart = cart;
    }
}
