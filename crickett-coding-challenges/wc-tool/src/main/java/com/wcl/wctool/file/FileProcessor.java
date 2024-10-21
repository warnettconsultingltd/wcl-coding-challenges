package com.wcl.wctool.file;

import java.io.File;
import java.security.InvalidParameterException;

public class FileProcessor {
    public long numberOfBytes(String fileName) {

        var file = new File(fileName);
        if (!file.exists()) {
            throw new InvalidParameterException(String.format("File '%s' does not exist", fileName));
        }
        return file.length();
    }
}
