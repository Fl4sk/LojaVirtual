import java.util.TreeSet;
import java.util.TreeMap;

public class Estoque implements ProductsTools, BasketTools {
    private TreeMap<Product, Integer> productsQuant;

    public Estoque() {
        productsQuant = new TreeMap<>();
    }


    public void setProducts(TreeSet<Product> products){
        clearAll();
        addAll(products);
    }

    public void setProductsQuant(TreeMap<Product, Integer> productsQuant){
        clearAll();
        this.productsQuant.putAll(productsQuant);
    }

    public void setProdctQuant(Product product, int quant){
        productsQuant.remove(product);
        addProduct(product, quant);
    }

    public TreeSet<Product> getProducts(){
        TreeSet<Product> products;

        products = new TreeSet<>(productsQuant.keySet());

        return products;
    }

    public TreeMap<Product, Integer> getProductsQuant(){
        return productsQuant;
    }

    public int getProdctQuant(Product product){
        return productsQuant.get(product);
    }

    public void addProduct(Product product){
        productsQuant.put(product, 0);
    }

    public void addProduct(Product product, int quant){
        productsQuant.put(product, quant);
    }

    public void addAll(TreeSet<Product> products){
        for (Product p : products) {
            addProduct(p);
        }
    }

    public void addAll(TreeMap<Product, Integer> productsQuant){
        this.productsQuant.putAll(productsQuant);
    }

    public void removeProduct(Product product, int quant){

    }

    public void removeProduct(Product product){

    }

    public void removeProduct(int index){

    }

    public void clearAll(){

    }

}
