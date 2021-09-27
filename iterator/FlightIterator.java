import java.util.Iterator;
/**
 * @author Neekon Sarmadi
 */
public class FlightIterator implements Iterator{
    private Flight[] flights;
    private int position = 0;
    /**
     * Constructor for the flight iterator class
     * @param flights array value for flights.
     */
    public FlightIterator(Flight[] flights){
        this.flights = flights;
    }
    /**
     * Boolean method that returns true once there are no more flights to iterate over
     */
    public boolean hasNext(){
        if (position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * Method to return the next flight if there is one.
     */
    public Flight next(){
        Flight flight = flights[position];
        position = position + 1;
        return flight;
    }
}
