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
            String[] cols = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);


            Product product = new Product(
                cols[1],        //name
                cols[3],        //brand
                cols[4],    //category
                Double.parseDouble(cols[5]),    //price
                Integer.parseInt(cols[7]),    //stock    
                cols[11]
            );
            products.add(product);
        }

        return products;
    }
}
