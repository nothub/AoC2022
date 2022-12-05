package lol.hub.aoc.y2022.day5;

public record Rule(int count, int source, int target) {
    public Rule(Integer[] arr) {
        this(arr[0], arr[1] - 1, arr[2] - 1);
    }
}
