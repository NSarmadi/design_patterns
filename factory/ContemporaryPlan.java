public class ContemporaryPlan extends HousePlan {
public ContemporaryPlan(){
    super(5, 40, 3000);
}
protected void setMaterials(){
    this.materials.add("- Ceramics \n- High-Strength Alloys \n- Composites \n");
}
protected void setFeatures(){
    this.features.add("- Oversized Windows \n- Unconventional Roofs \n- Minimalism \n- Open Floor Plan \n");
}
public String toString(){
    return "Contemporary Home" + super.toString();
}
}
