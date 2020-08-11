package com.kodilla.good.patterns.challenges;

public class OrderDto {

    final User user;
    final double totalPrice;
    final boolean isInRealization;

    public OrderDto(User user, double totalPrice, boolean isInRealization) {
        this.user = user;
        this.totalPrice = totalPrice;
        this.isInRealization = isInRealization;
    }

    public User getUser() {
        return user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isInRealization() {
        return isInRealization;
    }
}
