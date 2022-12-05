package lol.hub.tuples;

/**
 * Tuple length = 6
 */
public record Sextuple<T>(T a, T b, T c, T d, T e, T f) {
    public Sextuple(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
    }

    public T left() {
        return a;
    }

    public T right() {
        return f;
    }
}
