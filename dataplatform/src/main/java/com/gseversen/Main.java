package com.gseversen;

import java.util.List;

import extract.CsvExtractor;
import model.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> products = CsvExtractor.extract("data.csv");
        System.out.println("Total products extracted: " + products.size());

        for(int i = 0; i < 10; i++) {
            Product p = products.get(i);
            System.out.println(p.toString());
        }
    }
}