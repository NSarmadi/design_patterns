import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SCMedicalRecord implements MedicalRecord {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Gender gender;
    private ArrayList<Visit> visits;

    /**
     * Creates a new SCMedicalRecord
     * @param firstName first name of the patient
     * @param lastName last name of the patient
     * @param birthday birthday of the patient
     * @param gender gender of the patient
     */
    public SCMedicalRecord(String firstName, String lastName, Date birthday, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.visits = new ArrayList<Visit>();
    }
    /**
     * Method to return the first name of the patient
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * Method to return the last name of the patient
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * Method to get the birthday of the patient.
     */
    public Date getBirthday(){
        return birthday;
    }
    /**
     * Method to return the gender of the patient.
     */
    public Gender getGender(){
        return gender;
    }
    /**
     * Method to add a visit to the array list of visits. 
     */
    public void addVisit(Date date, boolean well, String description){
        visits.add(new Visit(date, well, description));
    }
    /**
     * Method to get the visit history. 
     */
    public ArrayList<Visit> getVisitHistory(){
        return visits;
    }
    /**
     * Method to get a birthday in the Simple Date Format.
     * @return returns the birthdate in simple date format form. 
     */
    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(birthday);
    }
    /**
     * Method to get a gender in the proper format
     * @return returns the gender in proper format.
     */
    private String getFormattedGender(){
        String genderText = gender.toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }
    /**
     * Method to format the output of the required information.
     */
    public String toString(){
        String result = "***** " + firstName + " " + lastName + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
