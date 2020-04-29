package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char gender;
    private final int numberOfPost;
    private final LocalDate dateOfBirth;

    public ForumUser(final int userID, final String username, final char gender, final int numberOfPost, final LocalDate dateOfBirth) {
        this.userID = userID;
        this.username = username;
        this.gender = gender;
        this.numberOfPost = numberOfPost;
        this.dateOfBirth= dateOfBirth;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", numberOfPost=" + numberOfPost +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
