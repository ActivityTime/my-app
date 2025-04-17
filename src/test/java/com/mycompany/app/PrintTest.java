package com.mycompany.app;

import org.junit.jupiter.api.Test;

public class PrintTest {

    @Test
    public void testPrint() {
        String expectedOutput = "Hello, World!==Hello,999, World!=java.version=17.0.2";
        System.out.println(expectedOutput);
    }
}
