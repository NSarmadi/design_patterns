public class TinyHomePlan extends HousePlan{
public TinyHomePlan(){
    super(1, 5, 200);
}
protected void setMaterials(){
    this.materials.add("- Lumber \n- Insulation \n- Metal Roofing \n- Hardware \n");
}
protected void setFeatures(){
    this.features.add("- Natural Light \n- Creative Storage \n- Multipurpose areas \n- Multi-use applications \n");
}
public String toString(){
    return "Tiny Home " + super.toString();
}
}
