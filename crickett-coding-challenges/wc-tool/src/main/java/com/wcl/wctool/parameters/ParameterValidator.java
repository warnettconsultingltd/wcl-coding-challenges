package com.wcl.wctool.parameters;

import java.security.InvalidParameterException;

public class ParameterValidator {
    public void validate(String... parameters) {
        if (parameters.length == 0) {
            throw new InvalidParameterException("No parameters were provided");
        }

        if (parameters.length > 1) {
            throw new InvalidParameterException("The file name should be the only parameter");
        }

    }
}
