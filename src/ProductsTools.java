import java.util.TreeSet;

public interface ProductsTools {
    void setProducts(TreeSet<Product> products);

    TreeSet<Product> getProducts();

    void addProduct(Product product);

    void addAll(TreeSet<Product> products);

    void removeProduct(Product product);

    void clearAll();
}
