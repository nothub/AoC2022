package lol.hub.aoc.y2022.day7;

import lol.hub.aoc.Solver;

import java.util.List;

import static lol.hub.aoc.y2022.day7.NoSpaceLeftOnDevice1.buildTree;

public class NoSpaceLeftOnDevice2 implements Solver<List<String>, Integer> {
    private static final int totalSize = 70000000;
    private static final int updateSize = 30000000;

    @Override
    public Integer solve(List<String> input) {
        Directory root = buildTree(input);
        return root.dirs().stream()
            .filter(dir -> dir.size() >= updateSize - (totalSize - root.size()))
            .mapToInt(Directory::size)
            .min()
            .orElseThrow();
    }
}
