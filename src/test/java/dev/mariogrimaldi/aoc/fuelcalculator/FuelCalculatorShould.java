package dev.mariogrimaldi.aoc.fuelcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FuelCalculatorShould {

    private FuelCalculator fuelCalculator;

    @Before
    public void setUp() throws Exception {
        fuelCalculator = new FuelCalculator();
    }

    @Test
    public void compute_2_for_mass_of_12() {
        int[] moduleMasses = { 12 };

        int neededFuel = fuelCalculator.computeFor(moduleMasses);

        assertThat(neededFuel, equalTo(2));
    }

    @Test
    public void compute_2_for_mass_of_14() {
        int[] moduleMasses = { 14 };

        int neededFuel = fuelCalculator.computeFor(moduleMasses);

        assertThat(neededFuel, equalTo(2));
    }

    @Test
    public void compute_654_for_mass_of_1969() {
        int[] moduleMasses = { 1969 };

        int neededFuel = fuelCalculator.computeFor(moduleMasses);

        assertThat(neededFuel, equalTo(654));
    }

    @Test
    public void compute_33583_for_mass_of_100756() {
        int[] moduleMasses = { 100756 };

        int neededFuel = fuelCalculator.computeFor(moduleMasses);

        assertThat(neededFuel, equalTo(33583));
    }

    @Test
    public void compute_the_sum_of_all_modules_fuel_requirements() {
        int[] moduleMasses = { 12, 14, 1969, 100756 };

        int neededFuel = fuelCalculator.computeFor(moduleMasses);

        assertThat(neededFuel, equalTo(34241));
    }
}
