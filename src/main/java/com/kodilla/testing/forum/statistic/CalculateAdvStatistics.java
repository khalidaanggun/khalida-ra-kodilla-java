package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class calculateAdvStatistics{
    int numberOfUser;
    int numberOfPost;
    int numberOfComments;
    int avgPostPerUser;
    int avgCommentsPerUser;
    int avgCommentsPerPost;
    Statistics statistics;

    public calculateAdvStatistics(Statistics statistics){
        this.statistics= statistics;
    }

    public List<String> userNames(String User) {
        List<String> userNames= new ArrayList<>();
        userNames.add(User);
        return userNames;
    }
    public void numberOfUser(){
        this.statistics.userNames().size();
       }
    numberOfUser= statistics.userNames().size();
    numberOfPost= postCount();
    numberOfComments = statistics.commentCount();
    avgPostPerUser= numberOfPost/numberOfUser;
    avgCommentsPerUser= numberOfComments/numberOfUser;
    avgCommentsPerPost= numberOfComments/numberOfPost;

    public void showStatistic(){
        System.out.println("number of user :"+ numberOfUser);
        System.out.println("number of post :"+ numberOfPost);
        System.out.println("number of comment :"+ numberOfComments);
        System.out.println("average of post per user :"+ avgPostPerUser);
        System.out.println("average od comments per user :"+ avgCommentsPerUser);
        System.out.println("averge of comments per post :"+ avgCommentsPerUser);
    }

    @Override


    @Override
    public int postCount() {
        return 0;
    }

    @Override
    public int commentCount() {
        return 0;
    }
}
