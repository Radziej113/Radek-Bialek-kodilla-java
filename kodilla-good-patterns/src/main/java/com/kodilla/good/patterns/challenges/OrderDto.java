package com.kodilla.good.patterns.challenges;

public class OrderDto {

    final User user;
    final int orderNumber;
    final double totalPrice;
    final boolean isInRealization;

    public OrderDto(User user, int orderNumber, double totalPrice, boolean isInRealization) {
        this.user = user;
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
        this.isInRealization = isInRealization;
    }

    public User getUser() {
        return user;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isInRealization() {
        return isInRealization;
    }
}
