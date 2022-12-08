package lol.hub.aoc.y2022.day8;

import lol.hub.aoc.Solver;

import java.util.List;
import java.util.stream.IntStream;

public class TreetopTreeHouse1 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        int[][] forest = parse(input);
        int visible = forest.length * 4 - 4; // edges

        for (int i = 0; i < forest.length; i++) {
            for (int j = 0; j < forest.length; j++) {
                if (i == 0 || i == forest.length - 1) continue;
                if (j == 0 || j == forest.length - 1) continue;
                if (isVisible(i, j, forest)) visible++;
            }
        }

        return visible;
    }

    static boolean isVisible(int row, int col, int[][] forest) {
        int tree = forest[row][col];
        return IntStream.iterate(row - 1, i -> i >= 0, i -> i - 1).noneMatch(i -> forest[i][col] >= tree)
            || IntStream.iterate(col - 1, j -> j >= 0, j -> j - 1).noneMatch(j -> forest[row][j] >= tree)
            || IntStream.range(row + 1, forest.length).noneMatch(i -> forest[i][col] >= tree)
            || IntStream.range(col + 1, forest.length).noneMatch(j -> forest[row][j] >= tree);
    }

    static int[][] parse(List<String> input) {
        int[][] forest = new int[input.size()][input.get(0).length()];

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(0).length(); j++) {
                forest[i][j] = input.get(i).charAt(j) - 48;
            }
        }

        return forest;
    }
}
