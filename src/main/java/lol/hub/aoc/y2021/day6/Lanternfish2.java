package lol.hub.aoc.y2021.day6;

import lol.hub.aoc.Solver;

public class Lanternfish2 implements Solver<String, Long> {

    @Override
    public Long solve(String input) {
        return Lanternfish1.solve(input, 256);
    }

}
