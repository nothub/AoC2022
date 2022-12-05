package lol.hub.tuples;

/**
 * Tuple length = 2
 */
public record Pair<T>(T a, T b) {
    public Pair(T[] arr) {
        this(arr[0], arr[1]);
    }

    public T left() {
        return a;
    }

    public T right() {
        return b;
    }
}
