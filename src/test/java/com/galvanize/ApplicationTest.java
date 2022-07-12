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
    @DisplayName("FizzBuzz Tests")
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Application.main(new String[]{"3"});
        assertEquals("Fizz", outContent.toString());

        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Application.main(new String[]{"5"});
        assertEquals("Buzz", outContent.toString());

        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Application.main(new String[]{"15"});
        assertEquals("FizzBuzz", outContent.toString());

        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Application.main(new String[]{"14"});
        assertEquals("14", outContent.toString());
    }
}