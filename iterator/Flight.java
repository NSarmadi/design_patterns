public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration = 0;
    private int transfers = 0;

    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return this.to;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getNumTransfers(){
        return this.transfers;
    }
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
