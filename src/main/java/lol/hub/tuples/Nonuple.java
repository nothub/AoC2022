package lol.hub.tuples;

/**
 * Tuple length = 9
 */
public record Nonuple<T>(T a, T b, T c, T d, T e, T f, T g, T h, T i) {
    public Nonuple(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
    }

    public T left() {
        return a;
    }

    public T center() {
        return e;
    }

    public T right() {
        return i;
    }
}
