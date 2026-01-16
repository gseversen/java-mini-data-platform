package extract;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class CsvExtractor {

    public static List<Product> extract(String resourceName) throws Exception {

        List<Product> products = new ArrayList<>();
        
        InputStream is = CsvExtractor.class.getClassLoader().getResourceAsStream(resourceName);

        if(is == null){
            throw new IllegalArgumentException("file not found! " + resourceName);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;

        // Skip header
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] cols = line.split(",", -1);

            Product product = new Product(
                cols[1],
                cols[3],
                cols[4],
                Double.parseDouble(cols[5]),
                Integer.parseInt(cols[7]),
                cols[11]
            );
            products.add(product);
        }

        return products;
    }
}
