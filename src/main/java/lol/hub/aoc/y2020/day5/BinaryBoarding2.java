package lol.hub.aoc.y2020.day5;

import lol.hub.aoc.PuzzleException;
import lol.hub.aoc.Solver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lol.hub.aoc.y2020.day5.BinaryBoarding1.parse;

public class BinaryBoarding2 implements Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {
        var seatIds = parse(input);
        var stats = seatIds.stream().collect(Collectors.summarizingInt(Integer::intValue));
        return IntStream.range(stats.getMin(), stats.getMax())
                // stripping seatIds.contains(id - 1) && seatIds.contains(id + 1)
                // from the filter produces the same result on the given input
                .filter(id -> !seatIds.contains(id))
                .findAny().orElseThrow(() -> new PuzzleException("No result found"));
    }

}
