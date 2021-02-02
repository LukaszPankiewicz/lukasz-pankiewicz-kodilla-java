package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;

    @Mock
    private Statistics statistics;

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Testing case#" + testCounter);
        testCounter++;
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Test case: end");

    }

    @BeforeAll
    public static void beforeTests() {
        System.out.println("Test suite: Begin");
    }

    @AfterAll
    public static void afterTests() {
        System.out.println("Test suite: End");
    }

    private List<String> generateNUsernames(int quantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= quantity; n++) {
            String userName = "TestUsername " + n;
            resultList.add(userName);
        }
        return resultList;
    }

    private void mockDatabase(int users, int posts, int comments) {
        when(statistics.usersNames()).thenReturn(generateNUsernames(users));
        when(statistics.postsCount()).thenReturn(posts);
        when(statistics.commentsCount()).thenReturn(comments);
    }

    @Nested
    @DisplayName("Test case: posts quantity")
    class TestIfPosts {
        @Test
        void testIfNullPosts() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(50, 0, 100);
            counter.calculateAdvStatistics(statistics);

            double result1 = counter.getAverageCommentsPerPost();
            double result2 = counter.getAveragePostsPerUser();

            Assertions.assertEquals(0, result1);
            Assertions.assertEquals(0, result2);
        }

        @Test
        void testIfThousandPosts() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(1000, 1000, 1000);
            counter.calculateAdvStatistics(statistics);

            double result1 = counter.getAverageCommentsPerPost();
            double result2 = counter.getAveragePostsPerUser();

            Assertions.assertEquals(1, result1);
            Assertions.assertEquals(1, result2);
        }
    }

    @Nested
    @DisplayName("Test case: comments quantity")
    class TestIfComments {
        @Test
        void testIfNullComments() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(1000, 1000, 0);
            counter.calculateAdvStatistics(statistics);

            double result = counter.getAverageCommentsPerPost();
            double result1 = counter.getAverageCommentsPerUser();

            Assertions.assertEquals(0, result);
            Assertions.assertEquals(0, result1);
        }

        @Test
        void testIfCommentsMoreThanPosts() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(10, 5, 10);
            counter.calculateAdvStatistics(statistics);

            double result = counter.getAverageCommentsPerPost();
            double result1 = counter.getAverageCommentsPerUser();

            Assertions.assertEquals(2, result);
            Assertions.assertEquals(1, result1);
        }
    }

    @Nested
    @DisplayName("Test case: users quantity")
    class TestIfUser {
        @Test
        void testIfNullUsers() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(0, 10, 10);
            counter.calculateAdvStatistics(statistics);

            double result = counter.getAveragePostsPerUser();
            double result1 = counter.getAverageCommentsPerUser();

            Assertions.assertEquals(0, result);
            Assertions.assertEquals(0, result1);
        }

        @Test
        void testIfHundredUsers() {
            StatisticsCounter counter = new StatisticsCounter();
            mockDatabase(100, 10, 10);
            counter.calculateAdvStatistics(statistics);

            double result = counter.getAveragePostsPerUser();
            double result1 = counter.getAverageCommentsPerUser();

            Assertions.assertEquals(0.1, result);
            Assertions.assertEquals(0.1, result1);
        }
    }
}


