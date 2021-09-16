public class ContemporaryPlan extends HousePlan {
public ContemporaryPlan(){
    super(5, 40, 3000);
}
protected void setMaterials(){
    this.materials.add("Ceramics, High-Strength Alloys, Composites");
}
protected void setFeatures(){
    this.features.add("Oversized Windows, Unconventional Roofs, Minimalism, Open Floor Plan");
}
public String toString(){
    return "Contemporary Plan" + super.toString();
}
}
