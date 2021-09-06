import java.util.ArrayList;
//Implements class observer.
public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName; 
    private ArrayList<Book> wishList;
    //Public method to call previously created objects.
    public Customer(Subject subject, String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.subject = subject;
        this.wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);

    }
    //When this method is called that means there has been a book added to the best sellers list.
    public void update(Book book){
        wishList.add(book);
    }
    //Displays all the items in the wish list.
    public void display(){
        System.out.println("Wish List: ");
        for(Book jj : wishList){
            System.out.println(" - "+jj);
        }
    }
}