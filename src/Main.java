import java.util.Random;
public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int player1Position = 0;
        System.out.println("Player start position: "+ player1Position);


        int rollDice = random.nextInt(6)+ 1;
        int option = random.nextInt(3); // 0,1, 3
        System.out.println("The number you got is "+ rollDice );


        if (option == 0){
            System.out.println("no play, you have to stay in same position "+ player1Position);
        }else if (option == 1){
            player1Position += rollDice;
            System.out.println("You got ladder, moves ahead of position "+ player1Position);
        } else {
        player1Position -= rollDice;
        System.out.println("You got Snake, moves behind of position "+ player1Position);
        }
    }
}