package lol.hub.aoc.y2022.day4;

import lol.hub.aoc.Solver;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CampCleanup1 implements Solver<List<String>, Integer> {
    static int analyze(List<String> input, Predicate<int[]> predicate) {
        return (int) input.stream()
            .map(line -> line.split("[,-]"))
            .map(arr -> Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray())
            .filter(predicate)
            .count();
    }

    @Override
    public Integer solve(List<String> input) {
        return analyze(input, a -> a[0] >= a[2] && a[1] <= a[3] || a[0] <= a[2] && a[1] >= a[3]);
    }
}
