package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.stubbing.OngoingStubbing;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test was finished");
    }

    int postsCountZero = 0;
    int postsCountOne = 1;
    int postsCountThousand = 1000;
    int commentsCountZero = 0;
    int commentsCountOne = 1;
    int commentsCountTwoThousand = 2000;
    int commentsCountTwenty = 20;

    List<String> hundredUserNames = new ArrayList<String>();
    {for (int i=0; i<100; i++) {
        hundredUserNames.add("i");
    }
    }

    List<String> zeroUserNames = new ArrayList<String>();

    @Test
    public void testCalculateNumberOfHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(hundredUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfUsers = calcAdvStats.calculateNumberOfUsers();

        //Then
        assertEquals(100, numberOfUsers);
    }

    @Test
    public void testCalculateNumberOfZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(zeroUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfUsers = calcAdvStats.calculateNumberOfUsers();

        //Then
        assertEquals(0, numberOfUsers);
    }

    @Test
    public void testCalculateNumberOfThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsCountThousand);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfPosts = calcAdvStats.calculateNumberOfPosts();

        //Then
        assertEquals(1000, numberOfPosts);
    }

    @Test
    public void testCalculateNumberOfZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsCountZero);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfPosts = calcAdvStats.calculateNumberOfPosts();

        //Then
        assertEquals(0, numberOfPosts);
    }

    @Test
    public void testCalculateNumberOfTwoThousandComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTwoThousand);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfComments = calcAdvStats.calculateNumberOfComments();

        //Then
        assertEquals(2000, numberOfComments);
    }

    @Test
    public void testCalculateNumberOfZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountZero);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        int numberOfComments = calcAdvStats.calculateNumberOfComments();

        //Then
        assertEquals(0, numberOfComments);
    }

    @Test
    public void testCalculateAverageOfPostsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsCountOne);
        when(statisticsMock.usersNames()).thenReturn(hundredUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        double avgPostsPerUser = calcAdvStats.calculateAverageOfPostsPerUser();

        //Then
        assertEquals(0.01, avgPostsPerUser, 0.001);
    }

    @Test
    public void testCalculateAverageOfPostsPerZeroUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postsCountOne);
        when(statisticsMock.usersNames()).thenReturn(zeroUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        double avgPostsPerUser = calcAdvStats.calculateAverageOfPostsPerUser();

        //Then
        assertEquals(0.0, avgPostsPerUser, 0.0001);
    }

    @Test
    public void testCalculateAverageOfCommentsPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountOne);
        when(statisticsMock.usersNames()).thenReturn(hundredUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        double avgCommentsPerUser = calcAdvStats.calculateAverageOfCommentsPerUser();

        //Then
        assertEquals(0.01, avgCommentsPerUser, 0.001);
    }

    @Test
    public void testCalculateAverageOfCommentsPerZeroUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountOne);
        when(statisticsMock.usersNames()).thenReturn(zeroUserNames);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        double avgCommentsPerUser = calcAdvStats.calculateAverageOfCommentsPerUser();

        //Then
        assertEquals(0.0, avgCommentsPerUser, 0.001);
    }

    @Test
    public void testCalculateAverageOfCommentsPerPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountOne);
        when(statisticsMock.postsCount()).thenReturn(postsCountThousand);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        double avgCommentsPerPost = calcAdvStats.calculateAverageOfCommentsPerPost();

        //Then
        assertEquals(0.001, avgCommentsPerPost, 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsCaseOne() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(zeroUserNames);
        when(statisticsMock.postsCount()).thenReturn(postsCountZero);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTwenty);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        calcAdvStats.calculateAdvStatistics(statisticsMock);
        int numberOfUsers = calcAdvStats.getNumberOfUsers();
        int numberOfPosts = calcAdvStats.getNumberOfPosts();
        int numberOfComments = calcAdvStats.getNumberOfComments();
        double numberOfPostsPerUser = calcAdvStats.getAverageOfPostsPerUser();
        double numberOfCommentsPerUser = calcAdvStats.getAverageOfCommentsPerUser();
        double numberOfCommentsPerPost = calcAdvStats.getAverageOfCommentsPerPost();

        //Then
        assertEquals(0, numberOfUsers);
        assertEquals(0, numberOfPosts);
        assertEquals(20, numberOfComments);
        assertEquals(0.0, numberOfPostsPerUser,0.001);
        assertEquals(0.0, numberOfCommentsPerUser,0.001);
        assertEquals(0.0, numberOfCommentsPerPost,0.001);
    }

    @Test
    public void testCalculateAdvStatisticsCaseTwo() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(hundredUserNames);
        when(statisticsMock.postsCount()).thenReturn(postsCountThousand);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountZero);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        calcAdvStats.calculateAdvStatistics(statisticsMock);
        int numberOfUsers = calcAdvStats.getNumberOfUsers();
        int numberOfPosts = calcAdvStats.getNumberOfPosts();
        int numberOfComments = calcAdvStats.getNumberOfComments();
        double numberOfPostsPerUser = calcAdvStats.getAverageOfPostsPerUser();
        double numberOfCommentsPerUser = calcAdvStats.getAverageOfCommentsPerUser();
        double numberOfCommentsPerPost = calcAdvStats.getAverageOfCommentsPerPost();

        //Then
        assertEquals(100, numberOfUsers);
        assertEquals(1000, numberOfPosts);
        assertEquals(0, numberOfComments);
        assertEquals(10.0, numberOfPostsPerUser,0.001);
        assertEquals(0.0, numberOfCommentsPerUser,0.001);
        assertEquals(0.0, numberOfCommentsPerPost,0.001);
    }

    @Test
    public void testShowStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(hundredUserNames);
        when(statisticsMock.postsCount()).thenReturn(postsCountThousand);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountTwenty);

        CalculateStatistics calcAdvStats = new CalculateStatistics(statisticsMock);

        //When
        calcAdvStats.calculateAdvStatistics(statisticsMock);
        String result = calcAdvStats.showStatistics();

        //Then
        assertEquals("Number of users: 100" + "\n"
                + "Number of posts: 1000" + "\n"
                + "Number of comments: 20" + "\n"
                + "Average posts per user: 10.0" + "\n"
                + "Average comments per user: 0.2" + "\n"
                + "Average comments per post: 0.02", result);
    }
}