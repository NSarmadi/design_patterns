/**
 * Written by Neekon Sarmadi
 */
public class HousePlanFactory{
    /**
     * CreateHousePlan creates a house plan depending on the type of house it is.
     * @param type is used to check if the plan lines up with the appropriate home.
     * @return returns the assigned house plan with all the features and materials set.
     */
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
    /**
     * Calling the functions to set the list
     */
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