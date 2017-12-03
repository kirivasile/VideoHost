package com.github.kirivasile.videohost;

import org.junit.Test;
import com.github.kirivasile.videohost.User;

import junit.framework.Assert;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");
        Assert.assertEquals("foo", u.getName());
    }
}