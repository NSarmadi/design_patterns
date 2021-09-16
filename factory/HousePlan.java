import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }
    protected void setMaterials(){
        return setMaterials();
    }
    protected void setFeatures(){
        return fea
    }
    public ArrayList<String> getMaterials() {
        return materials;
    }
    public ArrayList<String> getFeatures() {
        return features;
    }
    public int getNumRooms(){
        return numRooms;
    }
    public int getNumWindows(){
        return numWindows;
    }   
    public int getSquareFeet(){
        return squareFeet;
    }
    public String toString(){
        String result = "";
        result += "---------" + materials + "-------\n";
        result += "---------" + features + "-------\n"
    }

}