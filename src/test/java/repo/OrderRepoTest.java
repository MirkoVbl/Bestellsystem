package repo;

import model.Order;
import model.Product;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepoTest {

    @Test
    void list_ShouldReturn_AllOrders(){

        //GIVEN
        OrderRepo orderRepo = new OrderRepo();
        Order order = new Order("1",new Product("1","iPhone 14"));
        orderRepo.add(order);

        //WHEN
        Map<String, Order> actual = orderRepo.list();

        //THEN
        String expected = "{1=Order{id='1', produkt=Product{id='1', name='iPhone 14'}}}";
        assertEquals(expected, actual.toString());
    }
}
