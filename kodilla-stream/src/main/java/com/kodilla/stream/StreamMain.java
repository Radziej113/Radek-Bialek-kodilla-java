package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .filter(forumUser -> forumUser.getBirthDate().isAfter(now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPostsNumber() == 0)
                .collect(Collectors.toMap(ForumUser::getUniqueID, forumUser -> forumUser));

        System.out.println("# of Users: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}