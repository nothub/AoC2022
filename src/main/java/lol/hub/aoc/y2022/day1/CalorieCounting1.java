package lol.hub.aoc.y2022.day1;

import lol.hub.aoc.y2022.Solver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CalorieCounting1 implements Solver<List<String>, Integer> {

    @Override
    public Integer solve(List<String> input) {

        List<Integer> ints = new ArrayList<>();
        int current = 0;
        for (String s : input) {
            try {
                current = current + Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                ints.add(current);
                current = 0;
            }
        }

        return ints.stream().max(Integer::compareTo).orElseThrow();
    }

}
