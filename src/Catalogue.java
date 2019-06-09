import java.util.ArrayList;

public class Catalogue implements ProductsTools {
  private ArrayList<Product> products;

  public Catalogue() {
    products = new ArrayList<>();
  }

  public Catalogue(ArrayList<Product> products) {
    setProducts(products);
  }

  public void setProducts(ArrayList<Product> products) {
    this.products = products;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void addAll(ArrayList<Product> products) {
    this.products.addAll(products);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public void removeProduct(int index) {
    products.remove(index);
  }

  public void clearAll() {
    products.clear();
  }
}
