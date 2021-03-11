package com.kodilla.spring.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum () {
        forumUserList.add(new ForumUser("Peter", 10, 'M',
                LocalDate.of(1999,01,01), 10));
        forumUserList.add(new ForumUser("Michael", 11, 'M',
                LocalDate.of(1998,01,01), 11));
        forumUserList.add(new ForumUser("Amy", 12, 'F',
                LocalDate.of(1999,01,01), 12));
        forumUserList.add(new ForumUser("Kate", 13, 'F',
                LocalDate.of(2005,01,01), 13));
        forumUserList.add(new ForumUser("Frank", 14, 'M',
                LocalDate.of(2006,01,01), 14));
        forumUserList.add(new ForumUser("Hailey", 15, 'F',
                LocalDate.of(2008,01,01), 16));
        forumUserList.add(new ForumUser("Grace", 16, 'F',
                LocalDate.of(2008,01, 01), 16));
        forumUserList.add(new ForumUser("Qwe", 17, 'F',
                LocalDate.of(2009,01,01), 17));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
