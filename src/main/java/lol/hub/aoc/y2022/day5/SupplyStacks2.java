package lol.hub.aoc.y2022.day5;

import lol.hub.aoc.Solver;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lol.hub.aoc.y2022.day5.SupplyStacks1.parse;

public class SupplyStacks2 implements Solver<List<String>, String> {
    @Override
    public String solve(List<String> input) {
        List<Deque<String>> towers = new ArrayList<>();
        List<Rule> rules = new ArrayList<>();
        parse(input, towers, rules);

        rules.forEach(rule -> IntStream.range(0, rule.count())
            .mapToObj(i -> towers.get(rule.source()).removeFirst())
            .collect(Collectors.toCollection(ArrayDeque::new))
            .descendingIterator()
            .forEachRemaining(disk -> towers.get(rule.target()).addFirst(disk)));

        return towers.stream()
            .map(Deque::getFirst)
            .collect(Collectors.joining());
    }
}
