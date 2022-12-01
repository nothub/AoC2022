package lol.hub.aoc.y2020.day7;

import lol.hub.aoc.Solver;

import java.util.Map;

import static lol.hub.aoc.y2020.day7.HandyHaversacks1.parse;
import static lol.hub.aoc.y2020.day7.HandyHaversacks1.shinyGoldBag;

public class HandyHaversacks2 implements Solver<String, Integer> {

    @Override
    public Integer solve(String input) {
        return innerBags(shinyGoldBag, parse(input), false);
    }

    private int innerBags(String name, Map<String, Map<String, Integer>> bags, boolean isInner) {
        return bags.get(name).entrySet().stream().mapToInt(bag ->
                innerBags(bag.getKey(), bags, true) * bag.getValue()
        ).sum() + (isInner ? 1 : 0);
    }

}
