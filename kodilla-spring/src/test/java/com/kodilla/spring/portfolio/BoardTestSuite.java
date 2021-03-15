package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Make sandwich");
        board.getDoneList().getTasks().add("Eat breakfast");
        board.getInProgressList().getTasks().add("Do homework");

        //Then
        System.out.println(board.getToDoList());
        System.out.println(board.getDoneList());
        System.out.println(board.getInProgressList());
    }
}
