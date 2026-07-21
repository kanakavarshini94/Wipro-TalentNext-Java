package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks d = new DailyTasks();

        assertTrue(d.checkPresence("Wipro Technologies", "Tech"));

        assertFalse(d.checkPresence("Wipro Technologies", "Java"));
    }
}