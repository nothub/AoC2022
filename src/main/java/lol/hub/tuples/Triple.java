package lol.hub.tuples;

/**
 * Tuple length = 3
 */
public record Triple<T>(T a, T b, T c) {
    public Triple(T[] arr) {
        this(arr[0], arr[1], arr[2]);
    }

    public T left() {
        return a;
    }

    public T center() {
        return b;
    }

    public T right() {
        return c;
    }
}
