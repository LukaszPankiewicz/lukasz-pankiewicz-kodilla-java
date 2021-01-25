package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String userName;
    private final int userIdNumber;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPostsPublished;

    public ForumUser(final String userName, final int userIdNumber, final char sex,
                     final LocalDate birthDate, final int numberOfPostsPublished) {
        this.userName = userName;
        this.userIdNumber = userIdNumber;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfPostsPublished = numberOfPostsPublished;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserIdNumber() {
        return userIdNumber;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", userIdNumber=" + userIdNumber +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPostsPublished=" + numberOfPostsPublished +
                '}';
    }
}
