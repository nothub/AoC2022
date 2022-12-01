package lol.hub.aoc.y2020.day10;

import lol.hub.aoc.Solver;

import java.util.List;

public class AdapterArray1 implements Solver<List<Integer>, Integer> {

    @Override
    public Integer solve(List<Integer> input) {
        List<Integer> sorted = input.stream().sorted().toList();
        int diff1 = 1;
        int diff3 = 1;
        for (int i = 1; i < sorted.size(); i++) {
            int diff = sorted.get(i) - sorted.get(i - 1);
            if (diff == 1) {
                diff1++;
            } else if (diff == 3) {
                diff3++;
            }
        }
        return diff1 * diff3;
    }

}
