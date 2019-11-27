package com.example.assignment2gui;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import junit.extensions.ActiveTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mactivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    public MainActivity mactivity=null;
    @Before
    public void setUp() throws Exception {

        mactivity=mactivityTestRule.getActivity();
    }


    @Test
    public void testLaunch()
    {
        View view=mactivity.findViewById(R.id.firstname);
        assertNotNull(view);
    }
//    @Test
//    public void testpasswordvalidate()
//    {
//        View view=mactivity.findViewById(R.id.signuppassword);
//        View view1=mactivity.findViewById(R.id.signupconfirmpassword);
//        assertEquals(view1,view);
    //}

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(mactivity.isValidEmail("name@email.com"));
    }

    @Test
    public void add()
    {
        int x,y;
        x=2;
        y=4;
        assertEquals(2+4,6);
    }


    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(mactivity.isValidEmail("name@email.co.uk"));
    }
    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(mactivity.isValidEmail("name@email"));
    }
    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(mactivity.isValidEmail("name@email..com"));
    }
    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(mactivity.isValidEmail("@email.com"));
    }
    @Test
    public void Passwordvalidator_ReturnTrue() {
        assertTrue(mactivity.isValidPassword("12345678"));
    }


    @After
    public void tearDown() throws Exception {

        mactivity=null;
    }

}