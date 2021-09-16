public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    protected void setMaterials(){
        materials.add("Log Siding, Board and Batten Siding, White Pine");
    }
    protected void setFeatures(){
        features.add("Timbered Roof, High Insulation, Rustic Effect");
    }
    public String toString(){
        return "Log Cabin " + super.toString();
    }
}