package lol.hub.aoc.y2020.day6;

import lol.hub.aoc.Solver;

import java.util.Arrays;
import java.util.stream.Collectors;

import static lol.hub.aoc.y2020.Globals.LB_PRED;
import static lol.hub.aoc.y2020.Globals.LB_SECT;

public class CustomCustoms2 implements Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        var answers = input.chars().filter(LB_PRED.negate()).boxed().collect(Collectors.toSet());
        return Arrays.stream(input.strip().split(LB_SECT))
                .mapToInt(group -> (int) answers.stream().filter(answer ->
                        group.chars().filter(a -> a == answer).count() ==
                                group.chars().filter(LB_PRED).count() + 1
                ).count()).sum();
    }

}
