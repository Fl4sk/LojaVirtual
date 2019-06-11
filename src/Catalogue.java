import java.util.TreeSet;

public class Catalogue implements ProductsTools {
    private TreeSet<Product> products;

    public Catalogue() {
        products = new TreeSet<>();
    }

    public Catalogue(TreeSet<Product> products) {
        setProducts(products);
    }

    public void setProducts(TreeSet<Product> products) {
        this.products = products;
    }

    public TreeSet<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addAll(TreeSet<Product> products) {
        this.products.addAll(products);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearAll() {
        products.clear();
    }
}
