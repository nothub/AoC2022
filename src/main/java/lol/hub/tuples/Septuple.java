package lol.hub.tuples;

/**
 * Tuple length = 7
 */
public record Septuple<T>(T a, T b, T c, T d, T e, T f, T g) {
    public Septuple(T[] arr) {
        this(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
    }

    public T left() {
        return a;
    }

    public T center() {
        return d;
    }

    public T right() {
        return g;
    }
}
