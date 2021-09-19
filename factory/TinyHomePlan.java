/**
 * Written by Neekon Sarmadi
 */
public class TinyHomePlan extends HousePlan{
/**
 * TinyHomePlan calls the super for the HousePlan class and takes in the number of rooms, windows, and sqaure feet. 
 */
public TinyHomePlan(){
    super(1, 5, 200);
}
/**
 * Set Materials adds the appropriate materials to the materials array list.
 */
protected void setMaterials(){
    this.materials.add("- Lumber \n- Insulation \n- Metal Roofing \n- Hardware \n");
}
/**
 * Set Features adds the appropriate features to the features array list. 
 */
protected void setFeatures(){
    this.features.add("- Natural Light \n- Creative Storage \n- Multipurpose areas \n- Multi-use applications \n");
}
/**
 * @return returns the name of the home and calls the parent class toString method.
 */
public String toString(){
    return "Tiny House " + super.toString();
}
}