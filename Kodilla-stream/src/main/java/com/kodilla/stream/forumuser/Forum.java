package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
   private final  List<ForumUser> userList= new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Andy",'M',2, LocalDate.of(1986,11,10)));
        userList.add(new ForumUser(2, "Carlot",'F',2, LocalDate.of(1986,11,10)));
        userList.add(new ForumUser(3, "Sarlot",'F',2, LocalDate.of(1986,11,10)));
        userList.add(new ForumUser(4, "Tomek",'M', 1,LocalDate.of(2018,11,10)));
        userList.add(new ForumUser(5, "Tomas",'M',0, LocalDate.of(1986,11,10)));
        userList.add(new ForumUser(6, "Cilki",'F',2, LocalDate.of(1986,11,10)));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
