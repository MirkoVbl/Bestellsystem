package repo;

import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Product> products = new HashMap<>();

    public List<Product> listProducts(){

        return List.copyOf(products.values());
    }
}
