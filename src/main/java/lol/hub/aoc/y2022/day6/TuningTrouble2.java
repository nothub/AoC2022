package lol.hub.aoc.y2022.day6;

import lol.hub.aoc.Solver;

public class TuningTrouble2 implements Solver<String, Integer> {
    @Override
    public Integer solve(String input) {
        return TuningTrouble1.solve(input, 13);
    }
}
