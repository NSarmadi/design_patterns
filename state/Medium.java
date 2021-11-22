import java.util.Random;
public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game){
        this.game = game;
    }
    /**
     * Method to get a number between 1 and 50.
     */
    public int getNum(){
        int min = 1;
        int max = 50;
        int rand = 0;
        for (int i = 0; i < 1; i++){
            rand = (int)(Math.random()*max-min) + min;
        }
        return rand;
    }
    
    /**
     * Method to return a random operation of +, -, *.
     */
    public String getOperation(){
        String[] operator = {"+","-","*"};
        Random rand = new Random();
        String stringrand = operator[rand.nextInt(operator.length)];
        return stringrand;
    }
    /**
     * Method to advance the game to hard state.
     */
    public void levelUp(){
        this.game.setState(this.game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }
    /**
     * Method to insult the player for being dumb, levels the game down to easy. 
     */
    public void levelDown(){
        this.game.setState(this.game.getEasyState());
        System.out.println("You're not that smart, lets go down a level.");
    }
}

