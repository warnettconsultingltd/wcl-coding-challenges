package com.wcl.wctool.file;

import org.junit.jupiter.api.*;

import java.security.InvalidParameterException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    private FileProcessor fileProcessor;

    @BeforeEach
    public void instantiateTestSubject() {
        fileProcessor = new FileProcessor();
    }

    @Test
    public void whenFileNotFound_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, () -> fileProcessor.numberOfBytes("FakeFile.txt"));
        assertEquals("File 'FakeFile.txt' does not exist", exception.getMessage());
    }

    @Test
    public void whenFileNameAsParameter_thenNumberOfBytesInFileReturned() {
        final var testFile = Objects.requireNonNull(FileProcessorTest.class.getResource("/test.txt")).getFile();
        assertEquals(342190, fileProcessor.numberOfBytes(testFile));
    }
}
