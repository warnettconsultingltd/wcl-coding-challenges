package com.wcl.wctool;

import com.wcl.wctool.file.FileProcessor;

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
        final var fileProcessor = new FileProcessor();
        System.out.printf("Number of bytes %d%n",fileProcessor.numberOfBytes(fileName));
    }
}
