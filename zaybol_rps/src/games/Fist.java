package games;
import java.util.Random;

public class Fist {

    //@TODO: where can these fields come to use?
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    // en metod när den anrapas
    public int play() {
        Random playRandom = new Random();
        int result = playRandom.nextInt(2)+1;
        return result;
    }
}
