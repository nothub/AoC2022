package lol.hub.aoc.y2020.day6;

import lol.hub.aoc.Solver;

import java.util.Arrays;

import static lol.hub.aoc.y2020.Globals.LB_PRED;
import static lol.hub.aoc.y2020.Globals.LB_SECT;

public class CustomCustoms1 implements Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return Arrays.stream(input.split(LB_SECT)).mapToInt(group ->
                (int) group.chars().filter(LB_PRED.negate()).distinct().count()
        ).sum();
    }

}
