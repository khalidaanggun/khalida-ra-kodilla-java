package com.kodilla.testing.forum;

import org.junit.*;
import com.kodilla.testing.user.SimpleUser;

//import org.junit.Assert;
//import org.junit.Test;
public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUserName(){
        //Given
        SimpleUser simpleUser= new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUserName();
        //then
        Assert.assertEquals("theForumUser",result);
    }


}
