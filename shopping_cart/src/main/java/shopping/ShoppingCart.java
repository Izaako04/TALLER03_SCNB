package shopping;
import products.Product;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
    
    public double calculateTotalPrice(){
        double total = 0;
        return total;
    }
}
