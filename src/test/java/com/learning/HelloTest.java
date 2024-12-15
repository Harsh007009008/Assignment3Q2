package com.learning;

import org.junit.jupiter.api.Test;

public class HelloTest {
     @Test
    public void verifyNoExceptionThrown() {
        Hello.main(new String[]{});
    }
}
