package com.galvanize;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {


    @Test
    void fizzBuzz() {
        assertAll(() -> assertEquals("Fizz", Application.fizzBuzz(3)),
                () -> assertEquals("Buzz", Application.fizzBuzz(5)),
                () -> assertEquals("FizzBuzz", Application.fizzBuzz(15)),
                () -> assertEquals("13", Application.fizzBuzz(13)));
    }
}