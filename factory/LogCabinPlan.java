/**
 * Written by Neekon Sarmadi
 */
public class LogCabinPlan extends HousePlan{
    /**
     * LogCabinPlan calls the super for the HousePlan class and takes in the number of rooms, windows, and sqaure feet. 
     */
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    /**
     * Set Materials adds the appropriate materials to the materials array list.
     */
    protected void setMaterials(){
        this.materials.add("- Log Siding \n- Board and Batten Siding \n- White Pine \n");
    }
    /**
     * Set Features adds the appropriate features to the features array list. 
     */
    protected void setFeatures(){
        this.features.add("- Timbered Roof \n- High Insulation \n- Rustic Effect \n");
    }
    /**
     * @return returns the name of the home and calls the parent class toString method.
     */
    public String toString(){
        return "Log Cabin " + super.toString();
    }
}