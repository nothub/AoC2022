package lol.hub.aoc.y2022;

public class PuzzleException extends IllegalStateException {

    public PuzzleException(String s) {
        super(s);
    }

    public PuzzleException(String message, Throwable cause) {
        super(message, cause);
    }

}
