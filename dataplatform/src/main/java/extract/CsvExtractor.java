package extract;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class CsvExtractor {
    
    public static List<Product> extract(String path) throws Exception {
      
        List<Product> products = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(path));

        for(int i = 1; i < lines.size(); i++) {

            String[] cols = lines.get(i).split(",", -1);

            Product product = new Product(
                cols[1],
                cols[2],
                cols[3],
                Double.parseDouble(cols[5]),
                Integer.parseInt(cols[7]),
                cols[11]
            );
            products.add(product);
        }

        return products;
    }
}
