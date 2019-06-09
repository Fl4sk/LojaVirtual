public interface BasketTools {
  void setProducts(HashMap<Product, Integer>);
  
  void setProdctQuant(Product product, int quant);
  
  HashMap<Product, Integer> getProducts();
  
  int getProdctQuant(Product product, int quant);
  
  void addProduct(Product product, int quant);
  
  void removeProduct(Product product, int quant);
  
}
