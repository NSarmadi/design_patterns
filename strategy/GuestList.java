import java.util.ArrayList;

public class GuestList { 
    //enumeration
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;
    public GuestList(String title){
        //creating constructors
        this.searchBehavior = new LinearSearch();
        this.people = new ArrayList<String>();
        this.title = title;
    }
    //method to add a person using boolean 
    public boolean add(String person){
        if (searchBehavior.contains(people,person))
        {
            return false;
        }
        else
        {
            people.add(person);
            return true;
        }

    }
    //method to remove a person using boolean
    public boolean remove(String person) {
        if (searchBehavior.contains(people,person))
        {
            people.remove(person);
            return true;
        }
        else
        {
            return false;
        }
    }
    //method to return title
    public String getTitle(){
        return title; 
    }
    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
        this.searchBehavior = searchBehavior;
    }
    public ArrayList<String> getList(){
        return people;
    }

    


    
}