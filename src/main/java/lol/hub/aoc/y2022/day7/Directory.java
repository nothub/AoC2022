package lol.hub.aoc.y2022.day7;

import java.util.ArrayList;
import java.util.List;

final class Directory {
    public final String name;
    public final Directory parent;
    public final List<Directory> children;
    public final List<File> files;

    Directory(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
        this.children = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public int size() {
        return files.stream()
            .mapToInt(File::size)
            .sum() + children.stream()
            .mapToInt(Directory::size)
            .sum();
    }

    public List<Directory> dirs() {
        List<Directory> dirs = new ArrayList<>(children);
        for (Directory dir : children) {
            dirs.addAll(dir.dirs());
        }
        return dirs;
    }
}
