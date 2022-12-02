package lol.hub.aoc.y2022.day2;

import java.util.Map;

public enum Move {
    ROCK, PAPER, SCISSORS;

    public static final Map<Move, Move> rels = Map.of(
        ROCK,     SCISSORS,
        PAPER,    ROCK,
        SCISSORS, PAPER
    );

    public static Move of(String s) {
        return switch (s) {
            case "A", "X" -> ROCK;
            case "B", "Y" -> PAPER;
            case "C", "Z" -> SCISSORS;
            default -> throw new IllegalArgumentException();
        };
    }

    public static int score(Move a, Move b) {
        if      (a == b)            return a.value() + 3; // draw
        else if (rels.get(a) == b)  return a.value() + 6; // win
        else                        return a.value();     // loss
    }

    private int value() {
        return this.ordinal() + 1;
    }
}
