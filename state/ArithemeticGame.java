import java.util.Scanner;
public class ArithemeticGame {
private State easyState;
private State mediumState;
private State hardState;
private State state;
private int score;
private Scanner reader;

public ArithemeticGame(){
    easyState = new Easy(this);
    mediumState = new Medium(this);
    hardState = new Hard(this);
    state = new Easy(this);
    this.score = 0;
    reader = new Scanner(System.in);
}

/**
 * Method that gets two numbers and an operation from the state,
 * when the player gets a question right it will increase the score by 1,
 * when the player gets a question wrong, it will decrease the score by 1.
 */
public void pressQuestionButton(){
    int first = state.getNum();
    int second = state.getNum();
    String op = state.getOperation();
    System.out.println(first + op + second);
    int keyboard = reader.nextInt();
    if (op == "+"){
        if (keyboard == first + second){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
            score--;
        }
    }
    if (op == "-"){
        if (keyboard == first - second){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
            score--;
        }
    }
    if (op == "*"){
        if (keyboard == first * second){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
            score--;
        }
    }
    if (op == "/"){
        if (keyboard == first / second){
            System.out.println("Correct");
            score++;
        }else{
            System.out.println("Incorrect");
            score--;
       }
    }
    if (score >= 3){
        this.state.levelUp();
        score = 0;
    }else if (score <= -3){
        this.state.levelDown();
        score = 0;
    }
}   
    
/**
 * Method to set the state
 * @param state state being set
 */
public void setState(State state){
    this.state = state;
}
/**
 * Method to return the easyState
 * @return returns the easy state.
 */
public State getEasyState(){
    return easyState;
}
/**
 * Method to return the medium state.
 * @return returns the medium state.
 */
public State getMediumState(){
    return mediumState;
}
/**
 * Method to return the hard state.
 * @return returns the hard state.
 */
public State getHardState(){
    return hardState;
}
}