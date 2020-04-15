package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;
 public class CalculateAdvStatistics{
    public int numberOfUser;
    public int numberOfPost;
    public int numberOfComments;
    public int avgPostPerUser;
    public int avgCommentsPerUser;
    public int avgCommentsPerPost;


    public void calculateAdvStatistics(){

//        this.statistics= statistics;

    }

    public List<String> userNames(String User) {
        List<String> userNames= new ArrayList<>();
        userNames.add(User);
        return userNames;
    }
    public void calculator(Statistics statistics) {
        numberOfUser = statistics.userNames().size();
        numberOfPost = statistics.postCount();
        numberOfComments = statistics.commentCount();
        avgPostPerUser = numberOfPost / numberOfUser;
        avgCommentsPerUser = numberOfComments / numberOfUser;
        avgCommentsPerPost = numberOfComments / numberOfPost;
    }
    public void showStatistic(){
            System.out.println("number of user :" + numberOfUser);
            System.out.println("number of post :" + numberOfPost);
            System.out.println("number of comment :" + numberOfComments);
            System.out.println("average of post per user :" + avgPostPerUser);
            System.out.println("average od comments per user :" + avgCommentsPerUser);
            System.out.println("averge of comments per post :" + avgCommentsPerUser);
    }



 }

//     private int postCount() {
//     }
