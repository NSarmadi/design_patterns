/**
 * Written by Neekon Sarmadi
 */
/**
 * ContemporaryPlan calls the super for the HousePlan class and takes in the number of rooms, windows, and sqaure feet. 
 */
public class ContemporaryPlan extends HousePlan {
public ContemporaryPlan(){
    super(5, 40, 3000);
}
/**
 * Set Materials adds the appropriate materials to the materials array list.
 */
protected void setMaterials(){
    this.materials.add("- Ceramics \n- High-Strength Alloys \n- Composites \n");
}
/**
 * Set Features adds the appropriate features to the features array list. 
 */
protected void setFeatures(){
    this.features.add("- Oversized Windows \n- Unconventional Roofs \n- Minimalism \n- Open Floor Plan \n");
}
/**
 * @return returns the name of the home and calls the parent class toString method.
 */
public String toString(){
    return "Contemporary Home" + super.toString();
}
}