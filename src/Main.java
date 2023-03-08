import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("This problem simulates a Snake and Ladder Game. \n The Player starts from 0 rolls the die to get a number between 1 to 6, \n" +
                "finds a safe place ladder or a snake keeps doing till the winning spot 100 is achieved. \n\n");

        Random random = new Random();

        int player1Position = 0;
        System.out.println("Player start position: " + player1Position);

        while (player1Position < 100) {
            int rollDice = random.nextInt(6) + 1;
            System.out.println("the player got number " + rollDice);
            int option = random.nextInt(3); // 0,1, 2
            System.out.println("The option you got is " + option);


            if (option == 0) {
                System.out.println("no play, you have to stay in same position " + player1Position);
            } else if (option == 1) {

                player1Position += rollDice;
                System.out.println("You got ladder, moves ahead of position " + player1Position);

            } else {
                player1Position -= rollDice;
                System.out.println("You got Snake, moves behind of position " + player1Position);
            }
            if (player1Position < 0){
                System.out.println("the player start from Zero "+ player1Position);
            }
        }
        System.out.println("the player reaches winning position "+ player1Position);
    }
}