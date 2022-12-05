package lol.hub.tuples;

/**
 * Tuple length = 8
 */
public record Octuple<T>(T a, T b, T c, T d, T e, T f, T g, T h) {
    public Octuple(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
    }

    public T left() {
        return a;
    }

    public T right() {
        return h;
    }
}
