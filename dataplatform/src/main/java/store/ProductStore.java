package store;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductStore {
    
    private final List<Product> products;

    public ProductStore() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public int size() {
        return products.size();
    }

    public List<Product> getAll() {
        return List.copyOf(products);
    }

    public List<Product> findByBrand(String brand) {
       List<Product> result = new ArrayList<>();
       
        for(Product p : products) {
            if(p.getBrand().equalsIgnoreCase(brand)) {
                result.add(p);
            }
        }
        return result;
    }

}//end of ProductStore
