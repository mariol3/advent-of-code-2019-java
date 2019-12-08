package dev.mariogrimaldi.aoc.fuelcalculator;

import java.util.stream.IntStream;

public class FuelCalculator {
    public int computeFor(int[] moduleMasses) {
        return IntStream.of(moduleMasses)
                .reduce(0,
                        (fuelTotal, moduleMass) -> fuelTotal + Math.floorDiv(moduleMass, 3) - 2);
    }
}
