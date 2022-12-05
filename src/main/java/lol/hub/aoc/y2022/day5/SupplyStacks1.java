package lol.hub.aoc.y2022.day5;

import lol.hub.aoc.Solver;
import lol.hub.aoc.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SupplyStacks1 implements Solver<List<String>, String> {
    static void parse(List<String> input, List<Deque<String>> towers, List<Rule> rules) {
        var towersRaw = new ArrayList<String>();
        var rulesRaw = new ArrayList<String>();
        var towerCount = 0;

        var parseRules = false;
        for (String line : input) {
            if (line.isBlank()) continue;
            if (line.startsWith(" 1")) {
                String trimmed = line.trim();
                towerCount = Integer.parseInt(String.valueOf(trimmed.charAt(trimmed.length() - 1)));
                parseRules = true;
                continue;
            }
            if (parseRules) rulesRaw.add(line);
            else towersRaw.add(StringUtils.nth(line, 1, 4));
        }

        for (int i = 0; i < towerCount; i++) {
            towers.add(new ArrayDeque<>());
            for (String line : towersRaw) {
                if (i >= line.length() || line.charAt(i) == ' ') continue;
                towers.get(i).addLast("" + line.charAt(i));
            }
        }

        rulesRaw.stream()
            .map(s -> s.replaceAll("[^0-9 ]", ""))
            .map(String::trim)
            .map(s -> s.split(" "))
            .map(arr -> Arrays.stream(arr)
                .map(String::trim)
                .filter(s -> !s.isBlank())
                .mapToInt(Integer::valueOf)
                .boxed()
                .toArray(Integer[]::new))
            .map(Rule::new)
            .forEachOrdered(rules::add);
    }

    @Override
    public String solve(List<String> input) {
        List<Deque<String>> towers = new ArrayList<>();
        List<Rule> rules = new ArrayList<>();
        parse(input, towers, rules);

        rules.forEach(rule -> IntStream.range(0, rule.count())
            .mapToObj(i -> towers.get(rule.source()).removeFirst())
            .forEachOrdered(disk -> towers.get(rule.target()).addFirst(disk)));

        return towers.stream()
            .map(Deque::getFirst)
            .collect(Collectors.joining());
    }
}
