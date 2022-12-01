package lol.hub.aoc.y2021.day1;

import lol.hub.aoc.Solver;

import java.util.List;
import java.util.stream.IntStream;

public class SonarSweep1 implements Solver<List<Integer>, Long> {

    @Override
    public Long solve(List<Integer> input) {
        return IntStream
            .range(0, input.size() - 1)
            .filter(i -> input.get(i) < input.get(i + 1))
            .count();
    }

}
