package lol.hub.aoc.y2022.day3;

import lol.hub.aoc.Solver;
import lol.hub.aoc.util.Pair;

import java.util.List;

public class RucksackReorganization1 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        return input.stream()
            .map(line -> new Pair<>(
                line.substring(0, (line.length() / 2)).chars().boxed().toList(), // left
                line.substring((line.length() / 2)).chars().boxed().toList()) // right
            ).mapToInt(pair -> pair.left().stream()
                .filter(pair.right()::contains)
                .map(n -> Character.isUpperCase(n) ? (n - 'A') + 27 : (n - 'a') + 1)
                .findAny()
                .orElseThrow()
            ).sum();
    }
}
