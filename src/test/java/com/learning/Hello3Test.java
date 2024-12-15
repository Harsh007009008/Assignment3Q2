package com.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Hello3Test {
    private final Hello3 hello3 = new Hello3();
    @Test
    public void testSum() {
        assertEquals(5, hello3.sum(2, 3));
        assertEquals(-1, hello3.sum(2, -3));
        assertEquals(0, hello3.sum(0, 0));
        assertEquals(7, hello3.sum(7, 0));
        assertEquals(-5, hello3.sum(-2, -3));
    }

    

    

}
