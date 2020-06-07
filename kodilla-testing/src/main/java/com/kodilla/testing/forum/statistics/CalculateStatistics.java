package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageOfPostsPerUser;
    double averageOfCommentsPerUser;
    double averageOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int calculateNumberOfUsers() {
        return statistics.usersNames().size();
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int calculateNumberOfPosts() {
        return statistics.postsCount();
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int calculateNumberOfComments() {
        return statistics.commentsCount();
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double calculateAverageOfPostsPerUser() {
        if (statistics.usersNames().size()>0) {
            double postsNumber = statistics.postsCount();
            return postsNumber / (statistics.usersNames().size());
        } else {
            System.out.println("Expected error, wrong data");
            return 0.0;
        }
    }

    public void setAverageOfPostsPerUser(double averageOfPostsPerUser) {
        this.averageOfPostsPerUser = averageOfPostsPerUser;
    }

    public double getAverageOfPostsPerUser() {
        return averageOfPostsPerUser;
    }

    public double calculateAverageOfCommentsPerUser() {
        if (statistics.usersNames().size()>0) {
            double commentsNumber = statistics.commentsCount();
            return commentsNumber / (statistics.usersNames().size());
        } else {
            System.out.println("Expected error, wrong data");
            return 0.0;
        }
    }

    public void setAverageOfCommentsPerUser(double averageOfCommentsPerUser) {
        this.averageOfCommentsPerUser = averageOfCommentsPerUser;
    }

    public double getAverageOfCommentsPerUser() {
        return averageOfCommentsPerUser;
    }

    public double calculateAverageOfCommentsPerPost() {
        if (statistics.postsCount()>0) {
            double commentsNumber = statistics.commentsCount();
            return commentsNumber / (statistics.postsCount());
        } else {
            System.out.println("Expected error, wrong data");
            return 0.0;
        }
    }

    public void setAverageOfCommentsPerPost(double averageOfCommentsPerPost) {
        this.averageOfCommentsPerPost = averageOfCommentsPerPost;
    }
    public double getAverageOfCommentsPerPost() {
        return averageOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        setNumberOfUsers(calculateNumberOfUsers());
        setNumberOfPosts(calculateNumberOfPosts());
        setNumberOfComments(calculateNumberOfComments());
        setAverageOfPostsPerUser(calculateAverageOfPostsPerUser());
        setAverageOfCommentsPerUser(calculateAverageOfCommentsPerUser());
        setAverageOfCommentsPerPost(calculateAverageOfCommentsPerPost());
    }

    public String showStatistics() {
        return "Number of users: " + this.numberOfUsers + "\n"
                + "Number of posts: " + getNumberOfPosts() + "\n"
                + "Number of comments: " + getNumberOfComments() + "\n"
                + "Average posts per user: " + getAverageOfPostsPerUser() + "\n"
                + "Average comments per user: " + getAverageOfCommentsPerUser() + "\n"
                + "Average comments per post: " + getAverageOfCommentsPerPost();
    }
}
