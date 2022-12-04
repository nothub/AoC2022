package lol.hub.aoc.y2022.day4;

import lol.hub.aoc.Solver;

import java.util.Arrays;
import java.util.List;

public class CampCleanup2 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        return (int) input.stream()
            .map(line -> line.split("[,-]"))
            .map(arr -> Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray())
            .filter(a -> a[1] >= a[2] && a[0] <= a[3])
            .count();
    }
}
