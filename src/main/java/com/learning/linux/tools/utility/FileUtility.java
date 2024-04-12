package com.learning.linux.tools.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class FileUtility {

    private String filePath;

    public FileUtility(String filePath) {
        this.filePath = filePath;
    }

    public String[] readFileAsStringArray() {
        String[] parsedTextLines = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            parsedTextLines = br.lines().toArray(String[]::new);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Optional.of(parsedTextLines).orElse(new String[0]);
    }

    public String getFilePath() {
        return filePath;
    }
}
