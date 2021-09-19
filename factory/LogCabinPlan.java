public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    protected void setMaterials(){
        this.materials.add("- Log Siding \n- Board and Batten Siding \n- White Pine \n");
    }
    protected void setFeatures(){
        this.features.add("- Timbered Roof \n- High Insulation \n- Rustic Effect \n");
    }
    public String toString(){
        return "Log Cabin " + super.toString();
    }
}