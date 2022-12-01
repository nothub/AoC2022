package lol.hub.aoc.y2020.day2;

import lol.hub.aoc.Solver;

import static lol.hub.aoc.y2020.day2.PasswordPhilosophy1.pattern;

public class PasswordPhilosophy2 implements Solver<String, Integer> {

    @Override
    public Integer solve(String input) {

        var numValid = 0;

        var matcher = pattern.matcher(input);
        while (matcher.find()) {
            var chr = matcher.group(3).charAt(0);
            var pass = matcher.group(4);
            if (chr == pass.charAt(Integer.parseInt(matcher.group(1)) - 1) ^ chr == pass.charAt(Integer.parseInt(matcher.group(2)) - 1)) {
                numValid++;
            }
        }

        return numValid;

    }

}
