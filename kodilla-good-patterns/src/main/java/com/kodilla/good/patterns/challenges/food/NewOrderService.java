package com.kodilla.good.patterns.challenges.food;

import java.util.HashMap;

public class NewOrderService implements OrderService {

    @Override
    public boolean order(User user, HashMap<Product,Integer> orderList) {
        System.out.println("Receiving order form " + user.getName() + " " + user.getSurname());
        orderList.keySet()
                .stream()
                .map(product -> product.getName() + " from " + product.getContractor().getName())
                .forEach(System.out::println);
        return true;
    }
}
