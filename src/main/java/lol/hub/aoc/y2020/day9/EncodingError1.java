package lol.hub.aoc.y2020.day9;

/* day 9 ignored because too lazy for refactoring

import lol.hub.aoc.PuzzleException;
import lol.hub.aoc.Solver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EncodingError1 implements Solver<List<BigInteger>, BigInteger> {

    protected static BigInteger calcNumber(List<BigInteger> input, int preambleSize) {
        for (int i = 0; i < input.size(); i++) {
            List<Integer> indexes = IntStream.range(i, preambleSize + i).boxed().collect(Collectors.toList());
            BigInteger number = input.get(preambleSize + i);
            List<BigInteger> sums = new ArrayList<>();
            indexes.forEach(m -> indexes.forEach(n -> sums.add(input.get(m).add(input.get(n)))));
            if (!sums.contains(number)) {
                return number;
            }
        }
        throw new PuzzleException("No result found");
    }

    @Override
    public BigInteger solve(List<BigInteger> input, int preambleSize) {
        return calcNumber(input, preambleSize);
    }

    @Override
    public BigInteger solve(List<BigInteger> input) {
        return solve(input, 25);
    }

}

*/
