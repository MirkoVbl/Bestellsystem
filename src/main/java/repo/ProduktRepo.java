package repo;

import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProduktRepo {

    private Map<String, Product> products = new HashMap<>();

    public ProduktRepo() {
    }

    public void add(Product product){

        products.put(product.getId(), product);

    }

    public Map<String, Product> list(){
        return products;

    }


}
