package com.wcl.wctool;

import com.wcl.wctool.file.FileProcessor;
import com.wcl.wctool.parameters.ParameterValidator;

public class WcTool {
    public static void main(String... args) {
        final var parameterValidator = new ParameterValidator();
        parameterValidator.validate(args);

        final var fileName = args[0];
        final var fileProcessor = new FileProcessor();
        System.out.printf("%d %s%n",fileProcessor.numberOfBytes(fileName), fileName);
    }
}
