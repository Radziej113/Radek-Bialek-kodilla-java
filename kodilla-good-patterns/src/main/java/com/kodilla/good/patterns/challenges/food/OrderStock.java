package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;

public interface OrderStock {

    OrderDto createOrder(User user, HashMap<Product, Integer> orderList);
}
