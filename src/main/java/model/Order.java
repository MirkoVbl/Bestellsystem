package model;

import java.util.Objects;

public class Order {

    private String id;

    private Product product;

    public Order() {
    }

    public Order(String id, Product product) {
        this.id = id;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProdukt() {
        return product;
    }

    public void setProdukt(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", produkt=" + product +
                '}';
    }
}
