package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public interface OrderService {

    boolean order(User user, HashMap<String, Integer> orderList);
}
