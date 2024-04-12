package com.learning.linux.tools.utility;

import java.util.Objects;
import java.util.stream.Stream;

public class StringUtility {
    public static String[] removeNullsAndNegatives(Integer[] nums) {
        return Stream.of(nums)
                .filter(Objects::nonNull)
                .map((x) -> Integer.toString(x))
                .toArray(String[]::new);
    }

    public static String removeNullsAndNegativesAsString(Integer[] nums) {
        return String.join("\t", removeNullsAndNegatives(nums));
    }
}
