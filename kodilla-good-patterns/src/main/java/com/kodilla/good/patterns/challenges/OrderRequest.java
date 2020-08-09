package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class OrderRequest {

    User user;
    HashMap<String, Integer> orderList;

    public OrderRequest(User user, HashMap<String, Integer> orderList) {
        this.user = user;
        this.orderList = orderList;
    }

    public User getUser() {
        return user;
    }

    public HashMap<String, Integer> getOrderList() {
        return orderList;
    }
}
