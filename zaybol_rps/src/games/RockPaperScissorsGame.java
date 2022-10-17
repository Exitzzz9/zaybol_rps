package games;
import java.util.Scanner;

public class RockPaperScissorsGame {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    Player player;
    Fist aIFist;

    //@FIXME: An instance of the object cannot be created from outside its package if the constructor is not declared as public
    RockPaperScissorsGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFist = new Fist();
        //int result = Fist.play();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissorsGame game = new RockPaperScissorsGame("Zaia", 0);
        game.displayName();
        game.setAttempts();
        game.playRPS(scanner);
    }

    //@TODO: you can make this method one line shorter
    public void displayName() {
        System.out.println("Welcome to Rock, Paper and Scissors game! Please input your name: ");
        String name = player.getName();
        System.out.println("Hello " + name  +"! " );
    }
    public void setAttempts() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("You have three attempts");
        for (int i = 0; i < 2; i++) {
            playRPS(scanner);
        }
    }

    public void playRPS(Scanner scanner) {
        System.out.println("Please make your choice. 0 for Rock, 1 for Paper, 2 for Scissors!");
        int playerMove = scanner.nextInt();
        int computerMove = aIFist.play();
        System.out.println("You chose: " + playerMove + " Computer chose: " + computerMove);
        if (playerMove == computerMove) {
            System.out.print("It is a tie");
        } else {
            switch (playerMove) {
                case 0:
                    if (computerMove == 2)
                        System.out.print("User wins!");
                    else
                        System.out.print("AI wins!"); break;
                case 1:
                    if (playerMove == 0)
                        System.out.print("User wins!");
                    else
                        System.out.print("AI wins!"); break;
                case 2:
                    if (playerMove == 1)
                        System.out.print("User wins!");
                    else
                        System.out.print("AI wins!"); break;
            }
      
    /*void playGame () {
        System.out.println(player.getName());
        System.out.println(player.toString());
    }*/

        }
    }
}


