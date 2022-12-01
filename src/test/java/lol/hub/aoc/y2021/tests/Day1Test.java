package lol.hub.aoc.y2021.tests;

import lol.hub.aoc.y2021.day1.SonarSweep1;
import lol.hub.aoc.y2021.day1.SonarSweep2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 1: Sonar Sweep")
@Execution(ExecutionMode.CONCURRENT)
class Day1Test {

    private static final List<Integer> input = InputParser.integerList("inputs/2021/day1");

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(1342, new SonarSweep1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(1378, new SonarSweep2().solve(input), info);
    }

}
