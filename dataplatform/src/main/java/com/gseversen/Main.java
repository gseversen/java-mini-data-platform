package com.gseversen;

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
       
    }
}