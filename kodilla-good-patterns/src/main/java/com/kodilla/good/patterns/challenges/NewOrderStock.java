package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class NewOrderStock implements OrderStock {
    @Override
    public OrderDto createOrder(User user, HashMap<String, Integer> orderList) {
        return new OrderDto(user, 1, 150, true);
    }
}
