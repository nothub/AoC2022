package lol.hub.aoc.y2022.day6;

import lol.hub.aoc.PuzzleException;
import lol.hub.aoc.Solver;

import java.util.*;

public class TuningTrouble1 implements Solver<String, Integer> {
    static int solve(String input, int offset) {
        char[] charArray = input.toCharArray();
        for (int i = offset; i < charArray.length; i++) {
            if (set(charArray, offset, i).size() == offset + 1) return i + 1;
        }
        throw new PuzzleException("No result found!");
    }

    static Set<Character> set(char[] charArray, int offset, int i) {
        var set = new HashSet<Character>();
        var shift = offset;
        for (int j = 0; j <= offset; j++) {
            set.add(charArray[i - shift--]);
        }
        return set;
    }

    @Override
    public Integer solve(String input) {
        return solve(input, 3);
    }
}
