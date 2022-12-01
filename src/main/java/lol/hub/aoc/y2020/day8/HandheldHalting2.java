package lol.hub.aoc.y2020.day8;

import lol.hub.aoc.PuzzleException;
import lol.hub.aoc.Solver;

import java.util.List;
import java.util.stream.IntStream;

import static lol.hub.aoc.y2020.day8.HandheldHalting1.execute;
import static lol.hub.aoc.y2020.day8.HandheldHalting1.parse;
import static lol.hub.aoc.y2020.day8.Instruction.Operation.ACC;

public class HandheldHalting2 implements Solver<List<String>, Integer> {

    private static Integer bruteforce(List<Instruction> broken) {
        return IntStream.range(0, broken.size()).filter(i ->
                !broken.get(i).op.equals(ACC)
        ).boxed().map(i ->
                executePatched(broken, i)
        ).filter(result ->
                result.halted
        ).mapToInt(result ->
                result.val
        ).findAny().orElseThrow(() -> new PuzzleException("No result found"));
    }

    private static Result executePatched(List<Instruction> program, int i) {
        try {
            program.get(i).flipOp();
            return execute(program);
        } finally {
            program.get(i).flipOp();
            program.forEach(ins -> ins.visited = false);
        }
    }

    @Override
    public Integer solve(List<String> input) {
        return bruteforce(parse(input));
    }

}
