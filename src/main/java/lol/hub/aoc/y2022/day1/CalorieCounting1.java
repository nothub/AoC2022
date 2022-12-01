package lol.hub.aoc.y2022.day1;

import lol.hub.aoc.Solver;

import java.util.ArrayList;
import java.util.List;

public class CalorieCounting1 implements Solver<List<String>, Integer> {

    static List<Integer> parse(List<String> input) {
        List<Integer> numbers = new ArrayList<>();
        int current = 0;
        for (String s : input) {
            if (s.isEmpty()) {
                numbers.add(current);
                current = 0;
            } else {
                current = current + Integer.parseInt(s);
            }
        }
        return numbers;
    }

    @Override
    public Integer solve(List<String> input) {
        return parse(input).stream()
            .max(Integer::compareTo)
            .orElseThrow();
    }

}
