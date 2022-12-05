package lol.hub.aoc.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {
    public static String nth(String input, int start, int distance) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < input.length(); i = i + distance) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
