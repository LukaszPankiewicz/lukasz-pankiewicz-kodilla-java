package com.kodilla.good.patterns.challenges.product;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepo orderRepo;

    public OrderProcessor(final InformationService informationService, final ProductOrderService productOrderService, final ProductOrderRepo productOrderRepo) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepo = orderRepo;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.sendMessage(orderRequest.getUser());
            orderRepo.createOrder(orderRequest.getUser(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
