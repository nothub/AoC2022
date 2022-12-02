package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day1.CalorieCounting2;
import lol.hub.aoc.y2022.day2.RockPaperScissors1;
import lol.hub.aoc.y2022.day2.RockPaperScissors2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 2: Rock Paper Scissors")
@Execution(ExecutionMode.CONCURRENT)
class Day2Test {

    private static final List<String> inputExample = InputParser.stringList("inputs/2022/day2_example");
    private static final List<String> input = InputParser.stringList("inputs/2022/day2");

    @Test
    @DisplayName("Example 1")
    void example1(TestInfo info) {
        AssertWrapper.equals(15, new RockPaperScissors1().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(13809, new RockPaperScissors1().solve(input), info);
    }

    @Test
    @DisplayName("Example 2")
    void example2(TestInfo info) {
        AssertWrapper.equals(12, new RockPaperScissors2().solve(inputExample), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(12316, new RockPaperScissors2().solve(input), info);
    }

}
