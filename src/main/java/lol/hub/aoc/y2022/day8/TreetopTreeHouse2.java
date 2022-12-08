package lol.hub.aoc.y2022.day8;

import lol.hub.aoc.Solver;

import java.util.Arrays;
import java.util.List;

import static lol.hub.aoc.y2022.day8.TreetopTreeHouse1.parse;

public class TreetopTreeHouse2 implements Solver<List<String>, Integer> {
    @Override
    public Integer solve(List<String> input) {
        int[][] forest = parse(input);
        int[][] scores = new int[forest.length][forest.length];

        for (int i = 0; i < forest.length; i++) {
            for (int j = 0; j < forest.length; j++) {
                scores[i][j] = score(i, j, forest);
            }
        }

        return Arrays.stream(scores)
            .mapToInt(arr -> Arrays.stream(arr)
                .max()
                .orElseThrow())
            .max()
            .orElseThrow();
    }

    private int score(int row, int col, int[][] forest) {
        int tree = forest[row][col];
        int up = 0, down = 0, left = 0, right = 0;

        for (int i = row - 1; i >= 0; i--) {
            up++;
            if (forest[i][col] >= tree) break;
        }
        for (int i = row + 1; i < forest.length; i++) {
            down++;
            if (forest[i][col] >= tree) break;
        }
        for (int j = col - 1; j >= 0; j--) {
            left++;
            if (forest[row][j] >= tree) break;
        }
        for (int j = col + 1; j < forest.length; j++) {
            right++;
            if (forest[row][j] >= tree) break;
        }

        return up * down * left * right;
    }
}
