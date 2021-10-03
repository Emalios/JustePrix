package fr.emalios.justeprix;

/**
 * @author Emalios
 */

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(Reference.WELCOME);
        RobotResolver robotResolver = new RobotResolver(100, 1000);
        robotResolver.resolveAll();
    }
}
