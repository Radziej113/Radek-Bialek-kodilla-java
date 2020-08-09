package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public interface OrderStock {

    OrderDto createOrder(User user, HashMap<String, Integer> orderList);
}
