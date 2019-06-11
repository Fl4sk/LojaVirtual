import java.util.TreeMap;

public interface BasketTools {
    TreeMap<Product, Integer> getProductsQuant();

    int getProdctQuant(Product product);

    void addProduct(Product product, int quant);

    public void addAll(TreeMap<Product, Integer> productsQuant);

    void removeProductQuant(Product product, int quant);
}
