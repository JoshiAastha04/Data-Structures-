import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GameDriver {
    public static void main(String[] args) {
        // Declare/Initialize a Set of Game type
        Set<Game> gameSet = new HashSet<>();

        Game game1 = new Game("Candy Crush", 20.00);
        Game game2 = new Game("Temple Run", 25.00);
        Game game3 = new Game("Subway Surfers", 35.00);

        // Add objects to the set
        gameSet.add(game1);
        gameSet.add(game2);
        gameSet.add(game3);

        // Print set size
        System.out.println("Set size: " + gameSet.size());

        // Set size is still the same as the last size
        System.out.println("Set size (after adding): " + gameSet.size());

        // Print objects using the iterator
        Iterator<Game> iterator = gameSet.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println("Game Name: " + game.getName() + ", Price: " + game.getPrice());
        }

        Game game4 = new Game("Game 4", 19.99);
        boolean containsGame4 = gameSet.contains(game4);
        System.out.println("Contains Game 4: " + containsGame4);

        // Non-existing object
        Game game5 = new Game("Game 5", 39.99);
        boolean containsGame5 = gameSet.contains(game5);
        System.out.println("Contains Game 5: " + containsGame5);

        // Iterate over each object and print the name
        iterator = gameSet.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println("Game Name: " + game.getName());
        }

        // Remove 3 existing elements
        gameSet.remove(game1);
        gameSet.remove(game2);
        gameSet.remove(game3);

        // Remove a non-existing element
        boolean removedNonExisting = gameSet.remove(game4);
        System.out.println("Removed Game 5 (non-existing): " + removedNonExisting);

        // Print size
        System.out.println("Set size (after removal): " + gameSet.size());

        // Using an iterator, iterate over each object and print the price
        iterator = gameSet.iterator();
        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println("Game Price: " + game.getPrice());
        }

        // Clear the set
        gameSet.clear();

        // Print size
        System.out.println("Set size (after clearing): " + gameSet.size());
    }
}

class Game {
    private String name;
    private double price;

    public Game(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}