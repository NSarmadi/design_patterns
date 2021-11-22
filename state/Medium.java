import java.util.Random;
public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game){
        this.game = game;
    }

    public int getNum(){
        int min = 1;
        int max = 50;
        int rand = 0;
        for (int i = 0; i < 1; i++){
            rand = (int)(Math.random()*max-min) + min;
        }
        return rand;
    }
    

    public String getOperation(){
        String[] operator = {"+","-","*"};
        Random rand = new Random();
        String stringrand = operator[rand.nextInt(operator.length)];
        return stringrand;
    }

    public void levelUp(){
        this.game.setState(this.game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    public void levelDown(){
        this.game.setState(this.game.getEasyState());
        System.out.println("You're not that smart, lets go down a level.");
    }
}

