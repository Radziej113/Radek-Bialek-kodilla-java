package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class NewOrderStock implements OrderStock {

    @Override
    public OrderDto createOrder(User user, HashMap<Product, Integer> orderMap) {
        PriceCalculator priceCalculator = new PriceCalculator();
        double totalPrice = priceCalculator.calculatePrice(orderMap);

        boolean isInRealization = totalPrice > 0.0;

        return new OrderDto(user, totalPrice, isInRealization);
    }
}
