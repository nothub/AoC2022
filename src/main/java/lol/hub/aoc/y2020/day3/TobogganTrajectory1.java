package lol.hub.aoc.y2020.day3;

import lol.hub.aoc.Solver;

import java.util.List;

public class TobogganTrajectory1 implements Solver<List<String>, Integer> {

    protected static final char TREE = '#';

    @Override
    public Integer solve(List<String> input) {

        var trees = 0;
        var offset = 0;

        for (var line : input) {
            if (line.charAt(offset % line.length()) == TREE) {
                trees++;
            }
            offset = offset + 3;
        }

        return trees;

    }

}
