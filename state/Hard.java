import java.util.Random;
public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game){
        this.game = game;
    }

    /**
     * Method to get a number between 1 and 100.
     */
    public int getNum(){
        int min = 1;
        int max = 100;
        int rand = 0;
        for (int i = 0; i < 1; i++){
            rand = (int)(Math.random()*max-min) + min;
        }
        return rand;
    }
    /**
     * Method to return a random operation of +, -, *, /.
     */
    public String getOperation(){
        String[] operator = {"+","-","*","/"};
        Random rand = new Random();
        String stringrand = operator[rand.nextInt(operator.length)];
        return stringrand;
    }
    /**
     * Method to complement the player on their good work.
     */
    public void levelUp(){
     
        System.out.println("You're doing so well!");
    }
    /**
     * Method to insult the player for being dumb.
     */
    public void levelDown(){
        this.game.setState(this.game.getMediumState());
        System.out.println("You're an actual idiot, lets go down one.");
    }
}


    


