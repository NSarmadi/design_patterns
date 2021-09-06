import java.util.Observable;
import java.util.ArrayList;
//Implements class subject
public class BestSellers implements Subject{
    //Instantiation of array list observers and bestSellers
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    public BestSellers(){
        //Calling
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }
    //Registers observers to the array list.
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    //Removes observers from the array list.
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    //Notifies observers when a book has been added to the array list using a for loop.
    public void notifyObservers(Book book){
        for(Observer ns : observers){
            ns.update(book);
        }
    }
    //Adds a book and calls the notify observers method.
    public void addBook(Book book){
        bestSellers.add(book);
        notifyObservers(book);
    }
}