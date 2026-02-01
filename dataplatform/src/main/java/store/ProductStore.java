package store;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductStore {
    
    private List<Product> products;

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
        return products;
    }

}//end of ProductStore
