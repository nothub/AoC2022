package lol.hub.aoc.y2020.tests;

import lol.hub.aoc.y2020.day6.CustomCustoms1;
import lol.hub.aoc.y2020.day6.CustomCustoms2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 6: Custom Customs")
@Execution(ExecutionMode.CONCURRENT)
class Day6Test {

    private static final String example = InputParser.string("inputs/2020/day6_example");
    private static final String input = InputParser.string("inputs/2020/day6");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(11, new CustomCustoms1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(6768, new CustomCustoms1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(6, new CustomCustoms2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(3489, new CustomCustoms2().solve(input), info);
    }

}
