package com.wcl.wctool;

import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class WcToolTest {
    @Test
    public void whenNoParameters_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, WcTool::main);
        assertEquals("No parameters were provided", exception.getMessage());
    }


    @Test
    public void whenFileNotFound_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, () -> WcTool.main("FakeFile.txt"));
        assertEquals("File 'FakeFile.txt' does not exist", exception.getMessage());
    }

    @Test
    public void whenMultipleParameters_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, () -> WcTool.main("a","b"));
        assertEquals("The file name should be the only parameter", exception.getMessage());

    }

    @Test
    public void whenFileNameAsParameter_thenNumberOfBytesInFileReturned() {
        final var testFile = WcToolTest.class.getResource("/test.txt").getFile();

        WcTool.main(testFile);
    }
}
