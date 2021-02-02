package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    private double userCount;
    private double postCount;
    private double commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if ( userCount != 0 && postCount != 0 && commentCount != 0) {
            averagePostsPerUser = postCount / userCount;
            averageCommentsPerUser = commentCount / userCount;
            averageCommentsPerPost = commentCount / postCount;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
            averageCommentsPerPost = 0;
        }

    }
    public void showStatistics() {
        System.out.println("User's on forum: " + userCount + "." + " Post's on forum: " + postCount
        + "." + " Comment's on forum: " + commentCount + "." + " Average post's per user: " + averagePostsPerUser
         + "." + " Average comment's per user: " + averageCommentsPerUser + "." + " Average comment's" +
                "per post: " + averageCommentsPerPost + ".");
    }

    public double getUserCount() {
        return userCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void setUserCount(double userCount) {
        this.userCount = userCount;
    }

    public void setPostCount(double postCount) {
        this.postCount = postCount;
    }

    public void setCommentCount(double commentCount) {
        this.commentCount = commentCount;
    }

    public void setAveragePostsPerUser(double averagePostsPerUser) {
        this.averagePostsPerUser = averagePostsPerUser;
    }

    public void setAverageCommentsPerUser(double averageCommentsPerUser) {
        this.averageCommentsPerUser = averageCommentsPerUser;
    }

    public void setAverageCommentsPerPost(double averageCommentsPerPost) {
        this.averageCommentsPerPost = averageCommentsPerPost;
    }
}
