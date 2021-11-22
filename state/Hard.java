import java.util.Random;
public class Hard implements State {
    private ArithemeticGame game;

    public Hard(ArithemeticGame game){
        this.game = game;
    }


    public int getNum(){
        int min = 1;
        int max = 100;
        int rand = 0;
        for (int i = 0; i < 1; i++){
            rand = (int)(Math.random()*max-min) + min;
        }
        return rand;
    }

    public String getOperation(){
        String[] operator = {"+","-","*","/"};
        Random rand = new Random();
        String stringrand = operator[rand.nextInt(operator.length)];
        return stringrand;
    }

    public void levelUp(){
     
        System.out.println("You're doing so well!");
    }

    public void levelDown(){
        this.game.setState(this.game.getMediumState());
        System.out.println("You're an actual idiot, lets go down one.");
    }
}


    


