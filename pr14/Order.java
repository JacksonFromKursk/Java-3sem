package com.example.prac_14;

public class Order {
    String orderDate;

    public Order()
    {}
    public Order(String orderDate){
        this.orderDate=orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
