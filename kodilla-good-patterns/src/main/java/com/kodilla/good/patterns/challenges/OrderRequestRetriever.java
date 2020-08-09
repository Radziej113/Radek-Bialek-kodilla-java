package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Wick");

        HashMap<String, Integer> orderList = new HashMap<>();
        orderList.put("Toothbrush red", 1);
        orderList.put("Toothbrush green", 2);
        orderList.put("Neighbours - card game", 1);
        orderList.put("Buckwheat 1 kg", 3);

        return new OrderRequest(user, orderList);
    }
}
