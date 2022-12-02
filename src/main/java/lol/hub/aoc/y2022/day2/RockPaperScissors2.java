package lol.hub.aoc.y2022.day2;

import lol.hub.aoc.Solver;

import java.util.List;
import java.util.Map;

public class RockPaperScissors2 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        return input.stream()
            .map(s -> s.split(" "))
            .mapToInt(parts -> {
                Move m = Move.of(parts[0]);
                switch (parts[1]) {
                    case "X" /* loss */ -> { return Move.score(Move.rels.get(m), m); }
                    case "Y" /* draw */ -> { return Move.score(m, m); }
                    case "Z" /* win  */ -> {
                        return Move.score(Move.rels.entrySet().stream()
                            .filter(e -> m.equals(e.getValue()))
                            .map(Map.Entry::getKey)
                            .findFirst()
                            .orElseThrow(), m);
                    }
                    default -> throw new IllegalArgumentException();
                }
            }).sum();
    }
}
