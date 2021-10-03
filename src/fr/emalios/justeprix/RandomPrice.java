package fr.emalios.justeprix;

import java.util.Random;

/**
 * @author Emalios
 */

public class RandomPrice
{

    private Random random;

    public RandomPrice()
    {
        this.random = new Random();
    }

    public Integer generateRandomPrice(int max)
    {
        return random.nextInt(max);
    }
}
