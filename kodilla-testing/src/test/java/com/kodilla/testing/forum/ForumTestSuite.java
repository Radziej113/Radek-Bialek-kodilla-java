package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before() {

        System.out.println("Test Case: The Journey Begins!");
    }

    @After
    public void after() {

        System.out.println("Test Case: In the End");
    }

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("Test Suite: The End");
    }

    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "Mary Ann");
        //When
        String result = user.getUsername();
        System.out.println("Testing " + result);
        ///Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "Mary Ann");
        //When
        String result = user.getRealname();
        System.out.println("Testing " + result);
        ///Then
        Assert.assertEquals("Mary Ann", result);
    }
}