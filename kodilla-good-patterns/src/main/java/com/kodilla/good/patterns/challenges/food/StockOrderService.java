package com.kodilla.good.patterns.challenges.food;

public class StockOrderService {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderStock orderStock;
    private final ContractorProcessor contractorProcessor;

    public StockOrderService(InformationService informationService,
                             OrderService orderService, OrderStock orderStock,
                             ContractorProcessor contractorProcessor) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderStock = orderStock;
        this.contractorProcessor = contractorProcessor;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderMap());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderStock.createOrder(orderRequest.getUser(), orderRequest.getOrderMap());
            contractorProcessor.process(orderRequest);
            return new OrderDto(orderRequest.getUser(),
                    new PriceCalculator().calculatePrice(orderRequest.getOrderMap()), true);
        } else {
            return new OrderDto(orderRequest.getUser(), 0, false);
        }
    }
}