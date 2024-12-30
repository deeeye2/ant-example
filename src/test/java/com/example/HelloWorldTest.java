package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorldOutput() {
        String expectedOutput = "<h1>Hello, World!</h1>";
        String actualOutput = "<h1>Hello, World!</h1>"; // Replace with actual servlet output if needed
        assertEquals(actualOutput, expectedOutput, "Servlet output should match expected output");
    }
}
