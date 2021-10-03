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

    void findPrice()
    {
        System.out.println(Reference.PUT_NUMBER);
        int response = scanner.nextInt();
        if(response == price)
        {
            endGame();
            return;
        }
        if(response < price)
        {
            System.out.println("To Low !");
        }
        if(response > price)
        {
            System.out.println("To High !");
        }
        System.out.println(Reference.WRONG_NUMBER + "(" + response + ")");
        findPrice();
    }

    private void endGame()
    {
        System.out.println(Reference.END_GAME);
    }

}
