import java.util.Random;
public class Easy implements State {
    private ArithemeticGame game;


public Easy(ArithemeticGame game){
    this.game = game;
}

/**
 * Method to return a number between 1 and 10.
 */
public int getNum(){
    int min = 1;
    int max = 10;
    int rand = 0;
    for (int i = 0; i < 1; i++){
        rand = (int)(Math.random()*max-min) + min;
    }
    return rand;
}

/**
 * Method to randomly return either a + or -.
 */
public String getOperation(){
    String[] operator = {"+","-"};
    Random rand = new Random();
    String stringrand = operator[rand.nextInt(operator.length)];
    return stringrand;
}

/**
 * Method to advance the game to medium state
 */
public void levelUp(){
    this.game.setState(this.game.getMediumState());
    System.out.println("You're doing so well, lets go up one!");
}

/**
 * Method to insult the player for being dumb.
 */
public void levelDown(){
    System.out.println("It cant get any easier than this, try going back to elementary school.");
}

}
