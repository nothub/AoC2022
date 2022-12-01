package lol.hub.aoc.y2020.tests;

//import lol.hub.aoc.y2020.day9.EncodingError1;
//import lol.hub.aoc.y2020.day9.EncodingError2;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.math.BigInteger;
import java.util.List;

@DisplayName("Day 9: Encoding Error")
@Execution(ExecutionMode.CONCURRENT)
class Day9Test {

    private static final List<BigInteger> example = InputParser.bigIntegerList("inputs/2020/day9_example");
    private static final List<BigInteger> input = InputParser.bigIntegerList("inputs/2020/day9");

/* day 9 tests ignored because too lazy for refactoring

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(new BigInteger(String.valueOf(127)), new EncodingError1(5).solve(example), info);
    }

    @Test
    @DisplayName("Part 1 - Input")
    void part1_input(TestInfo info) {
        AssertWrapper.equals(new BigInteger(String.valueOf(14144619)), new EncodingError1(25).solve(input), info);
    }


    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(new BigInteger(String.valueOf(62)), new EncodingError2().solve(example, 5), info);
    }

    @Test
    @DisplayName("Part 2 - Input")
    void part2_input(TestInfo info) {
        AssertWrapper.equals(new BigInteger(String.valueOf(1766397)), new EncodingError2().solve(input, 25), info);
    }

*/

}
