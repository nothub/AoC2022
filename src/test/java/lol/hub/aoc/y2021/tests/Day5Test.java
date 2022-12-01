package lol.hub.aoc.y2021.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2021.day5.HydrothermalVenture1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DisplayName("Day 5: Hydrothermal Venture")
@Execution(ExecutionMode.CONCURRENT)
class Day5Test {

    private static final List<String> example = Collections.unmodifiableList(InputParser.stringList("inputs/2021/day5_example"));
    private static final List<String> input = Collections.unmodifiableList(InputParser.stringList("inputs/2021/day5"));

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(5, new HydrothermalVenture1().solve(new ArrayList<>(example)), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(5576, new HydrothermalVenture1().solve(new ArrayList<>(input)), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        // TODO
        //AssertWrapper.equals(-1, new HydrothermalVenture2().solve(new ArrayList<>(example)), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        // TODO
        //AssertWrapper.equals(-1, new HydrothermalVenture2().solve(new ArrayList<>(input)), info);
    }

}
