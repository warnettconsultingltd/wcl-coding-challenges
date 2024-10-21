package com.wcl.wctool;

import java.io.File;
import java.security.InvalidParameterException;

public class WcTool {
    public static void main(String... args) {
        if (args.length == 0) {
            throw new InvalidParameterException("No parameters were provided");
        }

        if (args.length > 1) {
            throw new InvalidParameterException("The file name should be the only parameter");
        }

        final var fileName = args[0];

        var file = new File(fileName);
        if (!file.exists()) {
            throw new InvalidParameterException(String.format("File '%s' does not exist", fileName));
        }

        System.out.println(file.length());
    }
}
