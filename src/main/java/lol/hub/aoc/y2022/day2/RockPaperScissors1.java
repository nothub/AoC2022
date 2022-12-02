package lol.hub.aoc.y2022.day2;

import lol.hub.aoc.Solver;

import java.util.List;

public class RockPaperScissors1 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        return input.stream()
            .map(s -> s.split(" "))
            .mapToInt(parts -> Move.score(Move.of(parts[1]), Move.of(parts[0])))
            .sum();
    }
}
