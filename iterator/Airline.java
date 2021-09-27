import java.util.Iterator;
/**
 * @author Neekon Sarmadi
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size = 0;
    /**
     * Constructor to set the value of the array to 2
     * @param title initializes the variable for title.
     */
    public Airline(String title){
        this.title = title;
        this.flights = new Flight[2];
    }
    /**
     * Method to add a flight
     * @param flightNum string value that holds the flight number
     * @param from string value that holds the from location
     * @param to string value that holds the to location
     * @param duration int value that holds the duration of the flight
     * @param transfers int value that holds the amount of transfers
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        Flight flightn = new Flight(flightNum, from, to, duration, transfers);
        if (size < flights.length){
            flights[size] = flightn;
            size++;
        }
        else{
            flights = growArray(flights);
            flights[size] = flightn;
            size++;
        }
    }
    /**
     * Method to return the title of the flight
     * @return returns the title
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * Method to copy the array and double it's size.
     * @param flights array value for flights
     * @return returns the new doubled array
     */
    private Flight[] growArray(Flight[] flights){
        Flight[] flighti = new Flight[flights.length*2];
        for (int i = 0; i < flights.length; i++){
            flighti[i] = flights[i];
        }
        return flighti;
    }
    /**
     * Method to create a new flight iterator
     * @return returns the new flight iterator
     */
    public FlightIterator createIterator(){
        return new FlightIterator(flights);
    }
}
