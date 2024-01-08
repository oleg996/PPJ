public class Cart {
    private String customerName;
    Product[] products={};

    private int productCount=0;

    public Cart(String customerName) {
        this.customerName = customerName;
    }

    void addProduct(Product p) {
        {
            p.addToShoppingCart(this);
        Product[] tmp = products;

        products = new Product[tmp.length + 1];

        for (int i = 0; i < tmp.length; i++) {
            products[i] = tmp[i];
        }
        products[tmp.length] = p;

        }
        productCount++;



    }

    void addProduct(String name, double price) {
       addProduct(new Product(name,price,this));
    }
    void print(){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName()+" price "+products[i].getPrice() );
        }
        System.out.println("Total "+productCount);
        System.out.println("Owner "+customerName);
    }
}
