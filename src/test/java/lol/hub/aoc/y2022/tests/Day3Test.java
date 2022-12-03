package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day3.RucksackReorganization1;
import lol.hub.aoc.y2022.day3.RucksackReorganization2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 3: Rucksack Reorganization")
@Execution(ExecutionMode.CONCURRENT)
class Day3Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day3_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day3");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals(157, new RucksackReorganization1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(7785, new RucksackReorganization1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals(70, new RucksackReorganization2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(2633, new RucksackReorganization2().solve(input), info);
    }

}
