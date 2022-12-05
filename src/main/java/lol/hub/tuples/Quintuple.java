package lol.hub.tuples;

/**
 * Tuple length = 5
 */
public record Quintuple<T>(T a, T b, T c, T d, T e) {
    public Quintuple(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3], arr[4]);
    }

    public T left() {
        return a;
    }

    public T center() {
        return c;
    }

    public T right() {
        return e;
    }
}
