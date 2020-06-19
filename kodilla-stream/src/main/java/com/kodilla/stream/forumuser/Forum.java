package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1, "Bonanzo", 'M',
                1999,3,3, 0));
        listOfForumUsers.add(new ForumUser(2, "MariaConchita", 'F',
                1919,1,2, 27));
        listOfForumUsers.add(new ForumUser(3, "Joana", 'F',
                2008,3,3, 0));
        listOfForumUsers.add(new ForumUser(4, "Magneto", 'M',
                2008,3,3, 1));
        listOfForumUsers.add(new ForumUser(5, "AnaJana", 'F',
                2008,3,3, 3));
        listOfForumUsers.add(new ForumUser(6, "B", 'F',
                2008,3,3, 3));
        listOfForumUsers.add(new ForumUser(7, "C", 'F',
                1990,3,3, 3));
        listOfForumUsers.add(new ForumUser(8, "D", 'F',
                1990,3,3, 3));
        listOfForumUsers.add(new ForumUser(9, "FF", 'F',
                1990,3,3, 0));
        listOfForumUsers.add(new ForumUser(10, "GG", 'M',
                1990,3,3, 0));
        listOfForumUsers.add(new ForumUser(11, "RAra", 'M',
                1990,3,3, 3));
        listOfForumUsers.add(new ForumUser(12, "GF", 'F',
                2000,6,17, 0));
        listOfForumUsers.add(new ForumUser(13, "DDD", 'M',
                2011,3,3, 3));
        listOfForumUsers.add(new ForumUser(14, "LOL", 'F',
                2000,6,20, 0));
        listOfForumUsers.add(new ForumUser(15, "AAA", 'M',
                2011,3,3, 3));
        listOfForumUsers.add(new ForumUser(16, "VB", 'F',
                2000,6,24, 0));
        listOfForumUsers.add(new ForumUser(17, "ccc", 'M',
                1970,3,3, 0));
        listOfForumUsers.add(new ForumUser(18, "x", 'F',
                1970,3,3, 3));
        listOfForumUsers.add(new ForumUser(19, "zzzoro", 'M',
                2011,3,3, 3));
        listOfForumUsers.add(new ForumUser(20, "hmmm", 'F',
                2011,3,3, 0));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }
}
