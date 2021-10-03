package fr.emalios.justeprix;

import java.util.Scanner;

/**
 * @author Emalios
 */

class Game
{

    private static final RandomPrice randomPrice = new RandomPrice();

    private int price;
    private Scanner scanner;

    Game(int maxPrice)
    {
        this.price = randomPrice.generateRandomPrice(maxPrice);
        this.scanner = new Scanner(System.in);
    }

    public boolean isPrice(int suggest) {
        return this.price == suggest;
    }

    public boolean isLower(int suggest) {
        return this.price < suggest;
    }

    public boolean isHigher(int suggest) {
        return this.price > suggest;
    }

    public int getPrice() {
        return price;
    }
}
