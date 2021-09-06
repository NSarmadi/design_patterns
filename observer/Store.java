import java.util.LinkedList;
import java.util.Queue;
//Implements observer class
public class Store implements Observer{
    private Subject subject;
    //private String title;
    private Queue<Book> bestSellers;
    //Method for queue to be held. 
    public Store(Subject subject){
        this.subject = subject;
        bestSellers = new LinkedList<>();
        this.subject.registerObserver(this);
    }
    //Adds a book to the best sellers list and checks to see if the queue has more than five items.
    public void update(Book book){
       bestSellers.add(book);
       if (bestSellers.size() > 5){
           bestSellers.remove();
       }
    }
    //Displays the five books listed in the best sellers.
    public void display(){
        System.out.println("Top 5 Best Sellers: ");
        for(Book jj : bestSellers){
            System.out.println(" - "+jj);
        }
    }
}