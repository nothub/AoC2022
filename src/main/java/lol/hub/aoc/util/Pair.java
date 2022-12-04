package lol.hub.aoc.util;

public record Pair<T>(T left, T right) {
    public Pair(T[] arr) {
        this(arr[0], arr[1]);
    }
}
