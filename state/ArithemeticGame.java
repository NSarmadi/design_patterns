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
    

public void setState(State state){
    this.state = state;
}

public State getEasyState(){
    return easyState;
}

public State getMediumState(){
    return mediumState;
}

public State getHardState(){
    return hardState;
}
}