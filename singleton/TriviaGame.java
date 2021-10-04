import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Neekon Sarmadi
 */
public class TriviaGame{
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
/**
 * Initializes previously enstantiated objects.
 * Reads in all of the questions into an array list of questions
 */
    private TriviaGame(){
        questions = DataLoader.getTriviaQuestions();
        this.rand =  new Random();
        this.reader = new Scanner(System.in);
    }
    /**
     * Gets an instance of a class
     * @return returns the instance of the class
     */
    public static TriviaGame getInstance(){
        if (triviaGame == null){
            triviaGame = new TriviaGame();
       }
       return triviaGame;
    }
    /**
     * Contains a while loop that will continue to play the game
     */
    public void play(){
        playRound();
        System.out.println("(P)lay or (Q)uit");
        String ans = reader.nextLine();
        while (ans.equalsIgnoreCase("p")){
            playRound();
            System.out.println("(P)lay or (Q)uit");
            ans = reader.nextLine();
        }
            System.out.println("You won " + score + " games!");
            System.out.println("Goodbye");
    }
    /**
     * Method that picks a random question and displays it, asks the user to enter an answer
     * @return returns true if the answer is correct, returns false if its incorrect.
     */
    private boolean playRound(){
    int question = rand.nextInt(questions.size());
    System.out.println(questions.get(question)); 
    System.out.println("Enter Answer: ");
    int ans = reader.nextInt();
    reader.nextLine();
    if (questions.get(question).isCorrect(ans)){
        System.out.println("YAY! You got it right!");
        score++;
        return true;
    }else {
    System.out.println("You got it wrong!");
    System.out.println("The Correct Answer Is: " + questions.get(question).getCorrectAnswer());
    return false;
        }
    }
}