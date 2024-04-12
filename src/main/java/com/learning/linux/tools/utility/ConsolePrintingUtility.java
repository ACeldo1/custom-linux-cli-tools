package com.learning.linux.tools.utility;

import java.util.Arrays;
import java.util.List;

public class ConsolePrintingUtility {
    private static void printArgsOnSingleLine(String... args) {
        System.out.printf("\n%s\n", String.join("\t", args));
    }
}
