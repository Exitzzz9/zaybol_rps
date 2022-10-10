package games;
import java.util.Scanner;

public class Player {
    int score;
   private String name;
    //constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
    public void rageQuit() {
        System.exit(0);
    }
    @Override
    public String toString(){
       return "Name: " + this.name + ", Score: " + this.score;
    }
}
