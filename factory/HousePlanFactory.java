public class HousePlanFactory{
    public static HousePlan createHousePlan(String type){
    HousePlan housePlan;

    if(type.equals("log cabin")){
        housePlan = new LogCabinPlan();
    }else if(type.equals("Tiny Home")){
        housePlan = new TinyHomePlan();
    }else if(type.equals("contemporary home")){
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