import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("My first game, Snake and Ladder");
        System.out.println("The Player starts from 0 rolls the die to get a number between 1 to 6 \n" +
                "A safe place, ladder or danger place the snake \n" + "keep doing till the winning spot 100 is achieved.\n\n");


        int player1Position = 0;
        System.out.println("Single player position: "+ player1Position);

        Random random = new Random();
        int rollDice = random.nextInt(6)+ 1;
        System.out.println("The number you got is "+ rollDice);



    }
}