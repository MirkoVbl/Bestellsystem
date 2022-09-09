package repo;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProductRepoTest {

    @Test
    void list_ShouldReturn_Products(){

        // GIVE
        Product product1 = new Product("1", "iPhone 14");
        Product product2 = new Product("2", "iPhone 13");
        Product product3 = new Product("3", "iPhone 12");
        Product product4 = new Product("4", "iPhone 11");

        // WHEN
        ProductRepo productRepo = new ProductRepo();

        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.add(product3);
        productRepo.add(product4);

        Map<String, Product> actual = productRepo.list();

        // THEN
        Map<String , Product> expected = new HashMap<>();
        expected.put(product1.getId(), product1);
        expected.put(product2.getId(), product2);
        expected.put(product3.getId(), product3);
        expected.put(product4.getId(), product4);

        assertEquals(expected, actual);

    }

    @Test
    void list_ShouldReturn_Products_ForFalse(){

        // GIVE
        Product product1 = new Product("1", "iPhone 14");
        Product product2 = new Product("2", "iPhone 13");
        Product product3 = new Product("3", "iPhone 12");
        Product product4 = new Product("4", "iPhone 11");

        // WHEN
        ProductRepo productRepo = new ProductRepo();

        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.add(product3);
        productRepo.add(product4);

        Map<String, Product> actual = productRepo.list();

        // THEN
        Map<String , Product> expected = new HashMap<>();
        expected.put(product1.getId(), product1);
        expected.put(product2.getId(), product2);
        expected.put(product3.getId(), product3);


        assertFalse(expected.equals(actual));

    }

    @Test
    void testForAdd_IncreaseByOne(){

        //GIVEN
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product("1","iPhone 14");
        productRepo.add(product1);
        int previousLength = productRepo.list().size();


        //WHEN
        Product productToAdd = new Product("2","iPhone 13");
        productRepo.add(productToAdd);
        int newLength = productRepo.list().size();

        //THEN
        assertEquals(previousLength+1,newLength);

    }

    @Test
    void get_ShouldReturn_Product(){
    // GIVEN
    Product product1 = new Product("1", "iphone 14");
    Product product2 = new Product("2", "iphone 12");
    Product product3 = new Product("3", "iphone 11");

    ProductRepo productRepo = new ProductRepo();
        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.add(product3);

    // WHEN
    Product actual = productRepo.get("1");

    // THEN
    String expected = "Product{id='1', name='iphone 14'}";
    assertEquals(expected, actual.toString());
}

    @Test
    void get_ShouldReturn_ProductByGivenId_ForFalse() {
        //GIVEN
        Product product1 = new Product("1", "iphone 14");
        Product product2 = new Product("2", "iphone 12");
        Product product3 = new Product("3", "iphone 11");

        ProductRepo productRepo = new ProductRepo();
        productRepo.add(product1);
        productRepo.add(product2);
        productRepo.add(product3);

        //WHEN
        Product actual = productRepo.get("1");

        //THEN
        String expected = "Product{id='2', name='iphone 12'}";
        assertFalse(expected.equals(actual.toString()));
    }
}

