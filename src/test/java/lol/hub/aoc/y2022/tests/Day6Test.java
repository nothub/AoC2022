package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day5.SupplyStacks1;
import lol.hub.aoc.y2022.day5.SupplyStacks2;
import lol.hub.aoc.y2022.day6.TuningTrouble1;
import lol.hub.aoc.y2022.day6.TuningTrouble2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 6: Tuning Trouble")
@Execution(ExecutionMode.CONCURRENT)
class Day6Test {

    private static final String input = InputParser.string("inputs/2022/day6");

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(1707, new TuningTrouble1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(3697, new TuningTrouble2().solve(input), info);
    }

}
