/**
 * @author Neekon Sarmadi
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration = 0;
    private int transfers = 0;

    /**
     * Constructor that calls previously enstantiated objects. 
     * @param flightNum string value that holds the flight number
     * @param from string value that holds the from location
     * @param to string value that holds the to location
     * @param duration int value that holds the duration of the flight
     * @param transfers int value that holds the amount of transfers
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * Method to get the from location
     * @return returns the from location
     */
    public String getFrom(){
        return this.from;
    }
    /**
     * Method to return the to location
     * @return returns the to location
     */
    public String getTo(){
        return this.to;
    }
    /**
     * Method to get the duration of the flight
     * @return returns the duration 
     */
    public int getDuration(){
        return this.duration;
    }
    /**
     * Method to get number of transfers
     * @return returns the amount of transfers
     */
    public int getNumTransfers(){
        return this.transfers;
    }
    /**
     * Method to return all the values in the correct syntax.
     * @return temp returns the seperated portion of the returned string
     */
    public String toString(){
        String temp = "Flight Number: " + this.flightNum +"\n"+ "From: " + this.from + "\n" + "To: " + this.to + "\n" + "Duration: " + this.duration/60 + " hours " + this.duration%60 + " minutes \n";
        if(transfers >= 2){
            return temp + this.transfers + " Transfers";
        }
        else if(transfers == 0) {
            return temp + "Direct Flight";
        }
        else{
            return temp + this.transfers + " Transfer";
        }
    }
}