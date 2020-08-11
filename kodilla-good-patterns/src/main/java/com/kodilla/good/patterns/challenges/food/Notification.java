package com.kodilla.good.patterns.challenges.food;

public class Notification implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Your order was proceed");
    }
}
