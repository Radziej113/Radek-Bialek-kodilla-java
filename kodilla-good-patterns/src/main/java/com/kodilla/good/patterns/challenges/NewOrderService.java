package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class NewOrderService implements OrderService {

    public boolean order(final User user, final HashMap<String, Integer> orderList) {
        System.out.println("Receiving order form " + user.getName() + " " + user.getSurname());
        orderList.keySet().stream().
                forEach(System.out::println);
        return true;
    }
}
