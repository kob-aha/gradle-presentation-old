package org.gradleintro.test.service;

import org.junit.Assert;
import org.gradleintro.service.MessageService;
import org.junit.Before;
import org.junit.Test;

public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage() {

        System.out.println("   ================ Running test method from class " + this.getClass().getName() +
                " ================ ");

        Assert.assertEquals("Hello World!", messageService.getMessage());
    }
}
