package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        InformationService mailService = new MailService();
        OrderService orderService = new NewOrderService();
        OrderStock newOrderStock = new NewOrderStock();

        ProductOrderService productOrderService = new ProductOrderService(
                mailService, orderService, newOrderStock);
        productOrderService.process(orderRequest);
    }

}
