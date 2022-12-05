package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day5.SupplyStacks1;
import lol.hub.aoc.y2022.day5.SupplyStacks2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 5: Supply Stacks")
@Execution(ExecutionMode.CONCURRENT)
class Day5Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day5_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day5");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals("CMZ", new SupplyStacks1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals("VJSFHWGFT", new SupplyStacks1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals("MCD", new SupplyStacks2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals("LCTQFBVZV", new SupplyStacks2().solve(input), info);
    }

}
