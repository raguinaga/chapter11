package chapter11;

import java.util.Random;

public class Die {
    private final int MIN_SIDES = 4;
    private int sides;
    private int value;

    /**
     * The constructor validates that there are at least for sides for a
     * die object and performs an initial roll the die.
     * @param numSides The number of sides for the die
     */
    public Die(int numSides) {
        //Validate the number of sides
        if (numSides < MIN_SIDES) {
            // Causes the JVM to actually throw an exception
            throw new IllegalArgumentException("The Die must have at " +
                    "least" + MIN_SIDES + " sides.");
        }

        //Store the number of sides and roll
        sides = numSides;
        roll();
    }

    /**
     * Creates a random object and rolls the die
     */
    public void roll() {
        // Create a random object
        Random rand = new Random();

        // Get a random value for the die
        value = rand.nextInt(sides) + 1;
    }

    /**
     * Gets how many sides are on the die
     * @return An integer value of sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * Returns the value of the roll
     * @return The value of the die roll
     */
    public int getValue() {
        return value;
    }
}
