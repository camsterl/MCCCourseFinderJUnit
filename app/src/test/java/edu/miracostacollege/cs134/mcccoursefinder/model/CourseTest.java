package edu.miracostacollege.cs134.mcccoursefinder.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {

    private Course testCourse;

    @Before
    public void setUp() throws Exception {
        //instantiate a object for testing
        testCourse = new Course("CS", "999","Recursive Stuff");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getId() {
        assertEquals("Testing the get id method", -1, testCourse.getId());
    }

    @Test
    public void setId() {
        testCourse.setId(321);
        assertEquals("Testing the set id method", 321, testCourse.getId());
    }

    @Test
    public void getAlpha() {
    }

    @Test
    public void getNumber() {
    }

    @Test
    public void getTitle() {
    }

    @Test
    public void setTitle() {
    }

    @Test
    public void getFullName() {
    }

    @Test
    public void testtoString() {
    }
}