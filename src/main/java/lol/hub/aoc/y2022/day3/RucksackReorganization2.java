package lol.hub.aoc.y2022.day3;

import lol.hub.aoc.Solver;

import java.util.List;
import java.util.stream.Collectors;

public class RucksackReorganization2 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        var sum = 0;
        for (int i = 0; i < input.size(); i = i + 3) {
            var a = input.get(i).chars();
            var b = input.get(i + 1).chars().boxed().collect(Collectors.toSet());
            var c = input.get(i + 2).chars().boxed().collect(Collectors.toSet());
            sum += a.boxed()
                .filter(b::contains)
                .filter(c::contains)
                .map(n -> Character.isUpperCase(n) ? (n - 'A') + 27 : (n - 'a') + 1)
                .findAny()
                .orElseThrow();
        }
        return sum;
    }
}
