package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day7.NoSpaceLeftOnDevice1;
import lol.hub.aoc.y2022.day7.NoSpaceLeftOnDevice2;
import lol.hub.aoc.y2022.day8.TreetopTreeHouse1;
import lol.hub.aoc.y2022.day8.TreetopTreeHouse2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 8: Treetop Tree House")
@Execution(ExecutionMode.CONCURRENT)
class Day8Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day8_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day8");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals(21, new TreetopTreeHouse1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(1676, new TreetopTreeHouse1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals(8, new TreetopTreeHouse2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(313200, new TreetopTreeHouse2().solve(input), info);
    }

}
