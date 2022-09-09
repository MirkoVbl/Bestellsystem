package service;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;
import repo.ProductRepo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ShopServiceTest {

    @Test
    void getProduct_ShouldReturn_ProductOfGivenId() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");
        ProductRepo productRepo = new ProductRepo();


        ShopService shopService = new ShopService(productRepo);
        shopService.addProduct(product);

        //WHEN
        Product actual = shopService.getProduct(product.getId());

        //THEN
        productRepo.add(product);
        Product expectedProduct = productRepo.get(product.getId());

        assertEquals(expectedProduct, actual);


    }

    @Test
    void addOrder_ShouldThrowException_ByWorngOrder() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");
        Product product2 = new Product("2", "iPhone 12");

        ProductRepo productRepo = new ProductRepo();

        ShopService shopService = new ShopService(productRepo);
        shopService.addProduct(product);

        //WHEN
        try {
            Order order = new Order(product2.getId(), product2);
            shopService.addOrder(order);
            fail();

        //THEN
        } catch (IllegalArgumentException e) {

        }
    }
}
