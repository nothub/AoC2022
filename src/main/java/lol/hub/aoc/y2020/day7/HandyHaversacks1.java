package lol.hub.aoc.y2020.day7;

import lol.hub.aoc.Solver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static lol.hub.aoc.y2020.Globals.LB;

public class HandyHaversacks1 implements Solver<String, Long> {

    protected static final Pattern pattern = Pattern.compile("^(.+) contain (.+)\\.$", Pattern.MULTILINE);
    protected static final String shinyGoldBag = "shiny gold bag";
    protected static final String emptyBag = "no other bag";

    protected static boolean containsGold(String bag, Map<String, Map<String, Integer>> bags) {
        return bag.equals(shinyGoldBag) || bags.get(bag).entrySet().stream().anyMatch(inner ->
                containsGold(inner.getKey(), bags)
        );
    }

    protected static Map<String, Map<String, Integer>> parse(String input) {
        Map<String, Map<String, Integer>> bags = new HashMap<>();
        Arrays.stream(input.replaceAll("bags", "bag").split(LB)).forEach(raw -> {
            Matcher matcher = pattern.matcher(raw);
            while (matcher.find()) {
                String name = matcher.group(1);
                bags.put(name, new HashMap<>());
                Set.of(matcher.group(2).split(", ")).stream().filter(rule ->
                        !rule.equals(emptyBag)
                ).forEach(rule ->
                        bags.get(name).put(rule.substring(2), Integer.parseInt(rule.substring(0, 1)))
                );
            }
        });
        return bags;
    }

    @Override
    public Long solve(String input) {
        var bags = parse(input);
        return bags.keySet().stream().filter(name ->
                !name.equals(shinyGoldBag)
        ).filter(name -> containsGold(name, bags)).count();
    }

}
