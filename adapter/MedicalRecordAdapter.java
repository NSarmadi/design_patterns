import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;    
    public MedicalRecordAdapter(HealthRecord record){
        this.record = record;
    }
    /**
     * Method to return the first name of the patient. 
     * Calls on the getName() function and uses the split function to return the string at index 0.
     */
    public String getFirstName(){
        String[] str = record.getName().split(" ");
        return str[0];
    }
    /**
     * Method to return the last name of the patient. 
     * Calls on the getName() function and uses the split function to return the string at index 1.
     */
    public String getLastName(){
        String[] str = record.getName().split(" ");
        return str[1];
    }
    /**
     * Method to return the birthday of the patient.
     */
    public Date getBirthday(){
        return record.getBirthdate();
    }
    /**
     * Method to return the gender from the list of genders. 
     */
    public Gender getGender(){
        String gen = record.getGender();
        if (gen.equalsIgnoreCase("MALE")){
            return Gender.MALE;
        }else if (gen.equalsIgnoreCase("FEMALE")){
            return Gender.FEMALE;
        }else {
            return Gender.OTHER;
        }
    }
    /**
     * Method to add the visit to the health record. 
     */
    public void addVisit(Date date, boolean well, String description){
        record.addHistory(date, well, description);
    }
    /**
     * Method that gets the visit history. 
     * Calls on ArrayList of visits and then adds the required information to the String array.
     */
    public ArrayList<Visit> getVisitHistory(){
    ArrayList<Visit> visits = new ArrayList<Visit>();
    for (int i = 0; i < record.getHistory().size(); i++){    
        String[] strHis = record.getHistory().get(i).split("[:\n]");
        // for (String s : strHis){
        //     System.out.println(s);
        // }
        Calendar myCalendar = new GregorianCalendar(Integer.parseInt(strHis[1].substring(13,17)),Integer.parseInt(strHis[1].substring(9,11)) - 1, Integer.parseInt(strHis[1].substring(5,7)));
        visits.add(new Visit(myCalendar.getTime(), Boolean.parseBoolean(strHis[3].trim()), strHis[5].trim()));
        }
        return visits;
    }
    /**
     * Method to format the output of the required information.
     */
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
     
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " +  simpleDateFormat.format(getBirthday()) + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";

        if(getVisitHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : getVisitHistory()){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
    
}
