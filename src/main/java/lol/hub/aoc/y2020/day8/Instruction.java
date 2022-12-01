package lol.hub.aoc.y2020.day8;

import lol.hub.aoc.PuzzleException;

import static lol.hub.aoc.y2020.day8.Instruction.Operation.JMP;
import static lol.hub.aoc.y2020.day8.Instruction.Operation.NOP;

class Instruction {

    protected Operation op;
    protected final int val;
    protected boolean visited;

    protected Instruction(Operation op, int val) {
        this.op = op;
        this.val = val;
    }

    protected void flipOp() {
        switch (op) {
            case JMP -> op = NOP;
            case NOP -> op = JMP;
            default -> throw new PuzzleException("Unable to flip operation: " + op);
        }
    }

    protected enum Operation {
        ACC, JMP, NOP
    }

}
