package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultOfForum = forum.getUserList().stream()
                .filter(user -> (user.getGender() == 'M') &&
                        (user.getDateOfBirth().isBefore(LocalDate.of(2000, 04, 29)))
                        && (user.getNumberOfPost() > 0))
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        System.out.println(resultOfForum);
    }
}