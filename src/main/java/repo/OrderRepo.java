package repo;

import model.Order;
import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders = new HashMap<>();

    public OrderRepo() {
    }

    public OrderRepo(Map<String, Order> orders) {
        this.orders = orders;
    }
    public void add(Order order){

        orders.put(order.getId(), order);

    }

    public Map<String, Order> list(){
        return orders;

    }
    public Order get(String id){
        return orders.get(id);

    }

}
