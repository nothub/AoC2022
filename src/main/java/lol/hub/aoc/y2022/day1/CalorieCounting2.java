package lol.hub.aoc.y2022.day1;

import lol.hub.aoc.Solver;

import java.util.Collections;
import java.util.List;

import static lol.hub.aoc.y2022.day1.CalorieCounting1.parse;

public class CalorieCounting2 implements Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {
        return parse(input).stream()
            .sorted(Collections.reverseOrder())
            .limit(3)
            .mapToInt(i -> i)
            .sum();
    }

}
