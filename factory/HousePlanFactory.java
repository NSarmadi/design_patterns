import java.util.ArrayList;

public abstract class HousePlanFactory extends HousePlan{
    public static HousePlan createHousePlan(String type){
    HousePlan housePlan;

    if(type.equals("logCabin")){
        housePlan = new LogCabinPlan();
    }else if(type.equals("tinyHouse")){
        housePlan = new TinyHomePlan();
    }else if(type.equals("contemporaryHouse")){
        housePlan = new ContemporaryPlan();
    }else{
        housePlan = new LogCabinPlan();
    }
    housePlan.setFeatures();
    housePlan.setMaterials();
    housePlan.getFeatures();
    housePlan.getMaterials();
    housePlan.getNumRooms();
    housePlan.getNumWindows();
    housePlan.getSquareFeet();
    
    return housePlan;
    }
 }

