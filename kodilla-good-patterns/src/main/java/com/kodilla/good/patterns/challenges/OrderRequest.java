package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class OrderRequest {

    User user;
    HashMap<Product, Integer> orderMap;

    public OrderRequest(User user, HashMap<Product, Integer> orderMap) {
        this.user = user;
        this.orderMap = orderMap;
    }

    public User getUser() {
        return user;
    }

    public HashMap<Product, Integer> getOrderMap() {
        return orderMap;
    }
}
