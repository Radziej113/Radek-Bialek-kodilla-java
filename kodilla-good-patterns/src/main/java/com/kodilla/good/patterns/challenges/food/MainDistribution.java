package com.kodilla.good.patterns.challenges.food;

public class MainDistribution {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        InformationService notification = new Notification();
        OrderService orderService = new NewOrderService();
        OrderStock newOrderStock = new NewOrderStock();
        ContractorProcessor contractorProcessor = new ContractorProcessor();

        StockOrderService stockOrderService = new StockOrderService(
                notification, orderService, newOrderStock, contractorProcessor);
        stockOrderService.process(orderRequest);


    }
}
