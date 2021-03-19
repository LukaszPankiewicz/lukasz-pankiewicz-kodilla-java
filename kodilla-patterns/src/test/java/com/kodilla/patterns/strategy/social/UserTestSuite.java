package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user = new Millenials("Mille");
        User user1 = new YGeneration("Ygen");
        User user2 = new ZGeneration("Zgen");

        //When
        String userShouldPublish = user.sharePost();
        System.out.println("User should publish: " + userShouldPublish);

        String user1ShouldPublish = user1.sharePost();
        System.out.println("User1 should publish: " + user1ShouldPublish);

        String user2ShouldPublish = user2.sharePost();
        System.out.println("User2 should publish: " + user2ShouldPublish);

        //Then
        assertEquals("Facebook", userShouldPublish);
        assertEquals("Twitter", user1ShouldPublish);
        assertEquals("Snapchat", user2ShouldPublish);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Mille");

        //When
        String userShouldPublish = user.sharePost();
        System.out.println("User should publish: " + userShouldPublish);

        user.setSocialPublisher(new TwitterPublisher());
        userShouldPublish = user.sharePost();
        System.out.println("User should publish now on: " + userShouldPublish);

        //Then
        assertEquals("Twitter", userShouldPublish);

    }
}