package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getId_ShouldReturnId_ProductId() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");

        //WHEN
        String actual = product.getId();

        //THEN

        assertEquals("1", actual);
    }

    @Test
    void getId_ShouldReturnId_ForFalse() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");

        //WHEN
        String actual = product.getId();

        //THEN
        Product expected = new Product("2","iPhone 14");

        assertFalse(expected.equals(actual));
    }

    @Test
    void getName_ShouldReturnName_OfProduct() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");

        //WHEN
        String actual = product.getName();

        //THEN

        assertEquals("iPhone 14", actual);
    }

    @Test
    void getName_ShouldReturnName_ForFalseProduct() {

        //GIVEN
        Product product = new Product("1", "iPhone 14");

        //WHEN
        String actual = product.getName();

        //THEN
        Product expected = new Product("1","iPhone 13");

        assertFalse(expected.equals(actual));
    }
}