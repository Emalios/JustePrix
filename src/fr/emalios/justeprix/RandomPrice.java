package fr.emalios.justeprix;

import java.util.Random;

/**
 * @author Emalios
 */

public class RandomPrice
{

    private Random random;
    private int max;

    public RandomPrice(int max)
    {
        this.random = new Random();
        this.max = max;
    }

    public Integer generateRandomPrice()
    {
        return random.nextInt(max);
    }
}
