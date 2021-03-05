package com.kodilla.good.patterns.challenges.product;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MessageService(), new ProductOrderService(), new ProductOrderRepo());
        orderProcessor.process(orderRequest);
    }

}
