package com.ud.dev.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {

        HelloController controller = new HelloController();
        String response = controller.Hello("World");
        assertEquals("Hello World", response);
    }
}