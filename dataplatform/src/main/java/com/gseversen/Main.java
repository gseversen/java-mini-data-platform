package com.gseversen;

import java.util.List;

import extract.CsvExtractor;
import model.Product;
import store.ProductStore;

public class Main {
    public static void main(String[] args) throws Exception {

        ProductStore store = new ProductStore();

        CsvExtractor.extract("data.csv", store);

        System.out.println("Total products extracted: " + store.size());

        int count = 0;
        for (Product p : store.getAll()) {
            if (count++ == 10) break;
            System.out.println(
                p.getName() + " | " + p.getBrand() + " | $" + p.getPrice()
            );
        }

        List<Product> jacksonProducts = store.findByBrand("Jackson Group");
        System.out.println("Jackson Group products found: " + jacksonProducts.size());

        for (int i = 0; i < Math.min(5, jacksonProducts.size()); i++) {
            Product p = jacksonProducts.get(i);
            System.out.println(p.getName() + " | $" + p.getPrice());
        }
        
       
    }
}