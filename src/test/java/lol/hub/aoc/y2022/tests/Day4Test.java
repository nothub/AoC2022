package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day4.CampCleanup1;
import lol.hub.aoc.y2022.day4.CampCleanup2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 4: Camp Cleanup")
@Execution(ExecutionMode.CONCURRENT)
class Day4Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day4_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day4");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals(2, new CampCleanup1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(560, new CampCleanup1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals(4, new CampCleanup2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(839, new CampCleanup2().solve(input), info);
    }

}
