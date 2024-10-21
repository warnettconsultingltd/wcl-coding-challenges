package com.wcl.wctool.parameters;

import com.wcl.wctool.WcTool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterValidatorTest {
    private ParameterValidator parameterValidator;

    @BeforeEach
    public void instantitateTestSubject() {
        parameterValidator = new ParameterValidator();
    }

    @Test
    public void whenNoParameters_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, () -> parameterValidator.validate());
        assertEquals("No parameters were provided", exception.getMessage());
    }

    @Test
    public void whenMultipleParameters_thenExceptionThrown() {
        final var exception = assertThrows(InvalidParameterException.class, () -> parameterValidator.validate("a","b"));
        assertEquals("The file name should be the only parameter", exception.getMessage());

    }
}
