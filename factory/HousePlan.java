import java.util.ArrayList;
/**
 * Written By Neekon Sarmadi
 */
public abstract class HousePlan{
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    /**
     * HousePlan calls the previously enstantiated objects. 
     * @param numRooms int value that stores number of rooms.
     * @param numWindows int value that stores the number of windows.
     * @param squareFeet int value that stores the square footage.
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }
    /**
     * abstract method to setMaterials
     */
    protected abstract void setMaterials();
    /**
     * abstract method to setFeatures
     */
    protected abstract void setFeatures();
    /**
     * Method that gets the materials from the array list.
     * @return returns the materials from the array list.
     */
    public ArrayList<String> getMaterials(){
        return materials;
    }
    /**
     * Method that gets the features from the array list.
     * @return returns the features from the array list.
     */
    public ArrayList<String> getFeatures(){
        return features;
    }
    /**
     * Method that gets the number of rooms for each house plan
     * @return returns the int value for number of rooms.
     */
    public int getNumRooms(){
        return numRooms;
    }
    /**
     * Method that gets the number of windows for each house plan.
     * @return returns the int value for number of windows.
     */
    public int getNumWindows(){
        return numWindows;
    }
    /**
     * Method that gets the square footage of each house plan.
     * @return returns the int value for square footage.
     */
    public int getSquareFeet(){
        return squareFeet;
    }
    /**
     * Method that returns a string representation of the house plan.
     * @return returns the result that has been configured to represent the house plan. 
     */
    public String toString(){
        String result = "";
        result += "\n";
        result += "Square Feet: "+ squareFeet + "\n";
        result += "Rooms: " + numRooms + "\n";
        result += "Windows: " + numWindows + "\n \n";
        
        for(String mt : materials){
            result += "Materials: \n" + mt + "\n";
        }
        for(String ft : features){
            result += "Features:  \n" + ft + "\n";
        }
        return result;
    }
}