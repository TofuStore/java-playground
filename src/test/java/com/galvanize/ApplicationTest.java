package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void convert() {
        assertAll(() -> assertEquals(1, Application.convert("I")),
                () -> assertEquals(5, Application.convert("V")),
                () -> assertEquals(4, Application.convert("IV")),
                () -> assertEquals(2006, Application.convert("MMVI")),
                () -> assertEquals(1944, Application.convert("MCMXLIV")));
    }
}