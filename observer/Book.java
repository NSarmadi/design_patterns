//Written by Neekon Sarmadi
public class Book {
    //Instantiation
    private String title;
    private String authorFirstName;
    private String authorLastName;
    //Public method that passes through it's parameters the previously created objects. 
    public Book(String title, String authorFirstName, String authorLastName){
        //Calling
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    //Method to return a title of a book.
    public String getTitle(){
        return this.title;
    }
    //Method to return an authors first name.
    public String getAuthorFirstName(){
        return this.authorFirstName;
    }
    //Method to return an authors last name.
    public String getAuthorLastName(){
        return this.authorLastName;
    }
    //Method that returns the title of the book as well as the authors full name to be printed out.
    public String toString(){
        return this.title+" by: "+this.authorFirstName+" "+this.authorLastName;
    }
}