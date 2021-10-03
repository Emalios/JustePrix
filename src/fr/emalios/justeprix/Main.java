package fr.emalios.justeprix;

/**
 * @author Emalios
 */

public class Main
{

    public static void main(String[] args)
    {

        System.out.println(Reference.WELCOME);

        Game game = new Game(100);
        game.findPrice();

    }
}
