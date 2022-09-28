package com.rdsolutions.testjenkins.controller;

import com.rdsolutions.testjenkins.model.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GreetingControllerTest {
    GreetingController controller;

    @BeforeEach
    void setUp() {
        controller = new GreetingController();
    }

    @Test
    void shouldReturnTheGreeting() {
        Greeting greeting = controller.greeting("Test");
        assertNotNull(greeting);
    }
}
