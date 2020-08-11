package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;

public interface OrderService {

    boolean order(User user, HashMap<Product,Integer> orderList);
}
