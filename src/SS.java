import java.util.Random;

public class SS {
    public static void main(String[] args) {
        // Create a new Random object
        Random random = new Random();

        // Initialize the player's position
        int position = 0;

        // Roll the die and check for options, repeatedly until the player reaches position 100
        while (position <= 100) {
            // Roll the die and check for options
            int dieRoll = random.nextInt(6) + 1; // Generate a random number between 1 and 6
            int option = random.nextInt(3); // Generate a random number between 0 and 2

            if (option == 0) {
                // No Play
                System.out.println("The player stays in the same position: " + position);
            } else if (option == 1) {
                // Ladder
                position += dieRoll; // Move ahead by the number of positions received in the die
                System.out.println("The player moves ahead to position: " + position);
            } else {
                // Snake
                position -= dieRoll; // Move behind by the number of positions received in the die
                if (position < 0) {
                    position = 0; // If the player goes below position 0, reset to position 0
                }
                System.out.println("The player moves behind to position: " + position);
            }
        }

        // The player has reached position 100
        System.out.println("The player has reached the winning position: " + position);
    }
}
