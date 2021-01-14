package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;


public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: Begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: End");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: Begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: End");
    }

    @DisplayName("When create SimpleUser with realName, then getRealName should return real name")

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing: " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("When create SimpleUser with name then getUsername should return correct name")

    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String expectedResult = "theForumUser";

        //When
        String result = simpleUser.getUsername();

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
