package lol.hub.aoc.y2020.day3;

import lol.hub.aoc.Solver;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static lol.hub.aoc.y2020.day3.TobogganTrajectory1.TREE;

public class TobogganTrajectory2 implements Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        var totalNumTrees = 1;

        for (var slope : List.of(
                new AbstractMap.SimpleEntry<>(1, 1),
                new AbstractMap.SimpleEntry<>(3, 1),
                new AbstractMap.SimpleEntry<>(5, 1),
                new AbstractMap.SimpleEntry<>(7, 1),
                new AbstractMap.SimpleEntry<>(1, 2))) {
            totalNumTrees *= calcNumTrees(input, slope.getKey(), slope.getValue());
        }

        return totalNumTrees;

    }

    private int calcNumTrees(List<String> input, int offsetH, int offsetV) {

        var trees = 0;
        var offset = 0;

        for (var line : IntStream.range(0, input.size()).filter(i -> i % offsetV == 0).mapToObj(input::get).collect(Collectors.toList())) {
            if (line.charAt(offset % line.length()) == TREE) {
                trees++;
            }
            offset += offsetH;
        }

        return trees;

    }

}
