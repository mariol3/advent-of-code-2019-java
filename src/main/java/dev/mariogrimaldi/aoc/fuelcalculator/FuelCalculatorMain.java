package dev.mariogrimaldi.aoc.fuelcalculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FuelCalculatorMain {
    public static void main(String[] args) throws IOException {
        int[] moduleMasses = Files.readAllLines(Paths.get("src/main/resources/fuelcalculator/module_masses.txt"))
                .stream()
                .mapToInt(Integer::valueOf)
                .toArray();
        FuelCalculator fuelCalculator = new FuelCalculator();
        System.out.println("Required fuel is: " + fuelCalculator.computeFor(moduleMasses));
    }
}
