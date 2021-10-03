package fr.emalios.justeprix;

public class RobotResolver {

    private static int ITERATIONS = 0;
    private static int CURRENT_ITERATIONS = 0;

    private int numberOfGame;
    private int max;
    private int maxPrice, minPrice;

    public RobotResolver(int numberOfGame, int max) {
        this.numberOfGame = numberOfGame;
        this.max = max;
        this.maxPrice = max;
    }

    public void resolveAll() {
        for (int i = 0; i < numberOfGame; i++) {
            Game game = new Game(max);
            System.out.println("Price expected: " + game.getPrice());
            resolve(game);
        }
        System.out.println("Resolve all games in: " + ITERATIONS + "\nSum: " + ITERATIONS/numberOfGame);
    }

    private void resolve(Game game) {
        int suggest = max/2;
        boolean resolved = false;
        while (!resolved) {
            if(game.isPrice(suggest)) {
                System.out.println("Game resolved in: " + CURRENT_ITERATIONS + " iterations.");
                CURRENT_ITERATIONS = 0;
                resolved = true;
            } else {
                CURRENT_ITERATIONS++;
                ITERATIONS++;
                if(game.isHigher(suggest)) {
                    minPrice = suggest;
                    suggest = (minPrice + maxPrice)/2;
                } else {
                    maxPrice = suggest;
                    suggest = maxPrice/2;
                }
            }
        }
        minPrice = 0;
        maxPrice = max;
    }

}
