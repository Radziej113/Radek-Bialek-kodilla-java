package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostsNumber;

    public ForumUser(final int uniqueID, final String userName, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int publishedPostsNumber) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPostsNumber = publishedPostsNumber;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostsNumber() {
        return publishedPostsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPostsNumber=" + publishedPostsNumber +
                '}';
    }
}
