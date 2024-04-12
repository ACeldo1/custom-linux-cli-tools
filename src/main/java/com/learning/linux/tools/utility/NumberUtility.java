package com.learning.linux.tools.utility;

import java.util.Objects;
import java.util.stream.Stream;

public class NumberUtility {
    public static int wordCount(String str) {
        int wordCount = 0, idx = 0, len = str.length();
        while (idx < len) {
            while (idx < len && Character.isWhitespace(str.charAt(idx))) idx++;
            wordCount++;
            while (idx < len && Character.isWhitespace(str.charAt(idx))) idx++;
        }
        return wordCount;
    }
}
