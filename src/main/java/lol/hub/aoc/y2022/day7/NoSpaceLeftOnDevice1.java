package lol.hub.aoc.y2022.day7;

import lol.hub.aoc.Solver;

import java.util.List;

public class NoSpaceLeftOnDevice1 implements Solver<List<String>, Integer> {
    static Directory buildTree(List<String> input) {
        var root = new Directory("", null);
        var pwd = root;

        for (var line : input) {
            if (line.equals("$ ls")) continue;
            if (line.startsWith("$ cd")) {
                // change pwd
                var name = line.split(" ")[2];
                pwd = switch (name) {
                    case "/"  -> root;
                    case ".." -> pwd.parent;
                    default   -> pwd.children.stream()
                        .filter(d -> d.name.equals(name))
                        .findAny()
                        .orElseThrow();
                };
            } else if (line.startsWith("dir")) {
                // create dir
                var name = line.split(" ")[1];
                pwd.children.add(new Directory(name, pwd));
            } else {
                // create file
                var data = line.split(" ");
                pwd.files.add(new File(data[1], Integer.parseInt(data[0])));
            }
        }

        return root;
    }

    @Override
    public Integer solve(List<String> input) {
        return buildTree(input).dirs().stream()
            .filter(d -> d.size() <= 100000)
            .mapToInt(Directory::size)
            .sum();
    }
}
