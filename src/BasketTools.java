import java.util.TreeMap;

public interface BasketTools {
    void setProductsQuant(TreeMap<Product, Integer> productsQuant);

    void setProdctQuant(Product product, int quant);

    TreeMap<Product, Integer> getProductsQuant();

    int getProdctQuant(Product product);

    void addProduct(Product product, int quant);

    void removeProduct(Product product, int quant);
}
