public class TinyHomePlan extends HousePlan{
public TinyHomePlan(){
    super(1, 5, 200);
}
protected void setMaterials(){
    materials.add("Lumber, Insulation, Metal Roofing, Hardware");
}
protected void setFeatures(){
    features.add("Natural Light, Creative Storage, Multipurpose areas, Multi-use applications");
}
public String toString(){
    return "Tiny Home " + super.toString();
}
}
