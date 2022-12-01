package lol.hub.aoc.y2020.tests;

import lol.hub.aoc.y2020.day2.PasswordPhilosophy1;
import lol.hub.aoc.y2020.day2.PasswordPhilosophy2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 2: Password Philosophy")
@Execution(ExecutionMode.CONCURRENT)
class Day2Test {

    private static final String example = InputParser.string("inputs/2020/day2_example");
    private static final String input = InputParser.string("inputs/2020/day2");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(2, new PasswordPhilosophy1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(638, new PasswordPhilosophy1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(1, new PasswordPhilosophy2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(699, new PasswordPhilosophy2().solve(input), info);
    }

}
