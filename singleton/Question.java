public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        this.answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer; 
    }
    public String toString(){
        return question  + "\n" + "1." + answers[0] + "\n" + "2." + answers[1] + "\n"+ "3." + answers[2] + "\n" + "4." + answers[3];
    }
    public boolean isCorrect(int userAnswer){
        if (userAnswer-1 == correctAnswer){
            return true;
        }
        return false;
    }
    public String getCorrectAnswer(){
        return answers[correctAnswer];
    }
}
