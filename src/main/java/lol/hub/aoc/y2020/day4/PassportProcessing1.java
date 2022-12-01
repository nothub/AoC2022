package lol.hub.aoc.y2020.day4;

import lol.hub.aoc.Solver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lol.hub.aoc.y2020.Globals.LB;

public class PassportProcessing1 implements Solver<String, Integer> {

    protected static List<Map<String, String>> parsePassports(String input) {
        List<Map<String, String>> passports = new ArrayList<>();
        for (var raw : input.split("((" + LB + ")\\d*)+(" + LB + ")")) {
            Map<String, String> passport = new HashMap<>();
            for (var pair : raw.replaceAll(LB, " ").split(" ")) {
                var data = pair.split(":");
                passport.put(data[0], data[1]);
            }
            passports.add(passport);
        }
        return passports;
    }

    @Override
    public Integer solve(String input) {
        return (int) parsePassports(input).stream().filter(this::checkValidity).count();
    }

    private boolean checkValidity(Map<String, String> passport) {
        return passport.containsKey("byr")
                && passport.containsKey("iyr")
                && passport.containsKey("eyr")
                && passport.containsKey("hgt")
                && passport.containsKey("hcl")
                && passport.containsKey("ecl")
                && passport.containsKey("pid");
    }

}
