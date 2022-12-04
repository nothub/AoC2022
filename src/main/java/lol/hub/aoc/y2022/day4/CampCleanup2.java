package lol.hub.aoc.y2022.day4;

import lol.hub.aoc.Solver;

import java.util.List;

import static lol.hub.aoc.y2022.day4.CampCleanup1.analyze;

public class CampCleanup2 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        return analyze(input, a -> a[1] >= a[2] && a[0] <= a[3]);
    }
}
