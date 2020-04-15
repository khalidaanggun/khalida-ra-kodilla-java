package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.CalculateAdvStatistics;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void numberOfPost0(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        users.add("itil");
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(0);
        when(stMock.commentCount()).thenReturn(100);
        //when
        int quantityOfPost= stMock.postCount();
        //then
        Assert.assertEquals(0, quantityOfPost);
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void numberOfPost1000(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        users.add("itil");
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(1000);
        when(stMock.commentCount()).thenReturn(100);

        calculateAdvStatistics.calculator(stMock);
        //when
        int quantityOfPost= stMock.postCount();
        //then
        Assert.assertEquals(1000, quantityOfPost );
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void numberOfComments0(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        users.add("itil");
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(100);
        when(stMock.commentCount()).thenReturn(0);

        calculateAdvStatistics.calculator(stMock);
        //when
        int quantityOfComments= stMock.commentCount();
        //then
        Assert.assertTrue("quantity of comment is not 0", quantityOfComments==0);
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void commentsLessThanPost(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        users.add("itil");
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(1000);
        when(stMock.commentCount()).thenReturn(100);

        calculateAdvStatistics.calculator(stMock);
        //when
        int quantityOfComments= stMock.commentCount();
        int quantityOfPost= stMock.postCount();
        //then
        Assert.assertTrue("comments is not Less Than Post", quantityOfComments <quantityOfPost );
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void commentsGreaterThanPost(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        users.add("itil");
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(100);
        when(stMock.commentCount()).thenReturn(1000);

        calculateAdvStatistics.calculator(stMock);
        //when
        int quantityOfComments= stMock.commentCount();
        int quantityOfPost= stMock.postCount();
        //then
        Assert.assertTrue("comments is not Greater Than Post", quantityOfComments >quantityOfPost );
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void numberOfUserIs0(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(0);
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(100);
        when(stMock.commentCount()).thenReturn(100);
         //when
        int quantityOfUser= stMock.userNames().size();
        //then
        Assert.assertEquals(0, quantityOfUser );
        calculateAdvStatistics.showStatistic();
    }
    @Test
    public void numberOfUser100(){
        //given
        Statistics stMock= mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics= new CalculateAdvStatistics();
        ArrayList<String> users= new ArrayList<String>(100);
        for(int i =0; i<100; i++){
            users.add("itil");
        }
        when(stMock.userNames()).thenReturn(users);
        when(stMock.postCount()).thenReturn(100);
        when(stMock.commentCount()).thenReturn(100);

        calculateAdvStatistics.calculator(stMock);
        //when
        int quantityOfUser= stMock.userNames().size();
        //then
        Assert.assertEquals(100, quantityOfUser );
        calculateAdvStatistics.showStatistic();
    }
}
