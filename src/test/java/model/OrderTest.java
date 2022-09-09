package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getId_ShouldReturn_IdOfOrderedProduct() {

            //GIVEN
            Product product = new Product("1", "iPhone 14");
            Order order = new Order("1",product);

            //WHEN
            String actual = order.getId();

            //THEN

            assertEquals("1", actual);
        }
        @Test
        void getId_ShouldReturn_IdOfOrderedProduct_ForFalse() {

            //GIVEN
            Product product = new Product("1", "iPhone 14");
            Order order = new Order("1",product);

            //WHEN
            String actual = order.getId();

            //THEN


            assertFalse("2".equals(actual));
        }


    @Test
    void getProduct_ShouldReturn_OrderedProduct() {
        //GIVEN
        Product product = new Product("1", "iPhone 14");
        Order order = new Order("1",product);

        //WHEN
        Product actual = order.getProdukt();

        //THEN

        assertEquals(product, actual);

    }
    @Test
    void getProduct_ShouldReturn_OrderedProduct_ForFalse() {
        //GIVEN
        Product product = new Product("1", "iPhone 14");
        Order order = new Order("1",product);

        //WHEN
        Product actual = order.getProdukt();

        //THEN
        Product product1 = new Product("2", "iPhone 13");

        assertFalse(product1.equals(actual));

    }
}