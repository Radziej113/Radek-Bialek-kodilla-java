package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class NewOrderService implements OrderService {

    public boolean order(final User user, final HashMap<Product, Integer> orderMap) {
        System.out.println("Receiving order form " + user.getName() + " " + user.getSurname());
        orderMap.keySet()
                .stream()
                .map(product -> product.getName())
                .forEach(System.out::println);
        return true;
    }
}
