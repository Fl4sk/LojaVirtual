import java.util.ArrayList;

public interface ProductsTools {
  void setProducts(ArrayList<Product> products);

  ArrayList<Product> getProducts();

  void addProduct(Product product);

  void addAll(ArrayList<Product> products);

  void removeProduct(Product product);

  void removeProduct(int index);

  void clearAll();
}
