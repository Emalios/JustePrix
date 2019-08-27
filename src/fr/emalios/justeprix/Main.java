package fr.emalios.justeprix;

/**
 * @author Emalios
 */

public class Main
{

    public static void main(String[] args)
    {

        System.out.println(Reference.WELCOME);

        int price = new RandomPrice(100)
                .generateRandomPrice();

        Game game = new Game(price);
        game.findPrice();

    }
}
