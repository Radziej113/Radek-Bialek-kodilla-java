package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderStock orderStock;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderStock orderStock) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderStock = orderStock;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderMap());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderStock.createOrder(orderRequest.getUser(), orderRequest.getOrderMap());
            return new OrderDto(orderRequest.getUser(),
                    new PriceCalculator().calculatePrice(orderRequest.getOrderMap()), true);
        } else {
            return new OrderDto(orderRequest.getUser(),0,false);
        }
    }
}