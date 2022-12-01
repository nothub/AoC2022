package lol.hub.aoc.y2020.day1;

import lol.hub.aoc.PuzzleException;
import lol.hub.aoc.Solver;

import java.util.List;

public class ReportRepair2 implements Solver<List<Integer>, Integer> {

    @Override
    public Integer solve(List<Integer> input) {

        for (var i = 0; i < input.size(); i++) {
            for (var j = 0; j < input.size(); j++) {
                if (i == j) {
                    continue;
                }
                for (var k = 0; k < input.size(); k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    if (input.get(i) + input.get(j) + input.get(k) == 2020) {
                        return input.get(i) * input.get(j) * input.get(k);
                    }
                }
            }
        }

        throw new PuzzleException("No result found");

    }

}
