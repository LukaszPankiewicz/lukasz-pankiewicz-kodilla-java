package com.kodilla.spring.stream;

import com.kodilla.spring.stream.forumuser.Forum;
import com.kodilla.spring.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        System.out.println("Default collection");
        System.out.println("# elements: " + theForum.getUserList().size() + "\n");
        theForum.getUserList().stream()
                .forEach(System.out::println);

        Map<Integer, ForumUser> theResultStringOfForum = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(),
                        LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPostsPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserIdNumber, forum -> forum));

        System.out.println("\n" + "Changed collection");
        System.out.println("# elements: " + theResultStringOfForum.size());
        theResultStringOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}