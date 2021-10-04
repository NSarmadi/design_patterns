/**
 * @author Neekon Sarmadi
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
/**
 * Method to hold the information for a trivia question
 */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        this.answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer; 
    }
    /**
     * Returns the string representation of the question w/ answers
     */
    public String toString(){
        return question  + "\n" + "1." + answers[0] + "\n" + "2." + answers[1] + "\n"+ "3." + answers[2] + "\n" + "4." + answers[3];
    }
    /**
     * Method that checks if the user answer is correct
     * @param userAnswer value for the user's answer
     * @return returns true if the answer is correct, false if incorrect
     */
    public boolean isCorrect(int userAnswer){
        if (userAnswer-1 == correctAnswer){
            return true;
        }
        return false;
    }
    /**
     * Method that gets the correct answer
     * @return returns the text string of correct answer
     */
    public String getCorrectAnswer(){
        return answers[correctAnswer];
    }
}
