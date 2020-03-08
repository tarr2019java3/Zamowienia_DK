package pl.sda.zamowienia;

import java.util.Date;

public class Order {

    private Customer customer;
    private Product product;
    private int quantity;

    Date date = new Date();

    private long orderDate = date.getTime();

    public Order(Customer customer, Product product, int quantity, long orderDate) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) throws NameException {
        if(customer == null){
            throw new NameException("Musi być użytkownik");
        } else {
            this.customer = customer;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws NameException{
        if(quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new NameException("Liczba produktów musi być dodatnia");
        }
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) throws NameException{
        if (orderDate >= date.getTime()) {
            this.orderDate = orderDate;
        } else {
            throw new NameException("Data musi być najpóźniej dzisiejsza");
        }
    }
}
