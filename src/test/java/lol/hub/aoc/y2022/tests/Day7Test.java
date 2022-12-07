package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day7.NoSpaceLeftOnDevice1;
import lol.hub.aoc.y2022.day7.NoSpaceLeftOnDevice2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 7: No Space Left On Device")
@Execution(ExecutionMode.CONCURRENT)
class Day7Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day7_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day7");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals(95437, new NoSpaceLeftOnDevice1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(1315285, new NoSpaceLeftOnDevice1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals(24933642, new NoSpaceLeftOnDevice2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(9847279, new NoSpaceLeftOnDevice2().solve(input), info);
    }

}
