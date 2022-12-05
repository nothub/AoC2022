package lol.hub.tuples;

/**
 * Tuple length = 4
 */
public record Quartet<T>(T a, T b, T c, T d) {
    public Quartet(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3]);
    }

    public T left() {
        return a;
    }

    public T right() {
        return d;
    }
}
