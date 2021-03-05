package com.kodilla.good.patterns.challenges.product;

public class MessageService implements InformationService {
    @Override
    public void sendMessage(User user) {
        System.out.println("Confirmation message has been sent");
    }
}
