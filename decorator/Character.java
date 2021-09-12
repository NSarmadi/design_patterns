/*
*Written by Neekon Sarmadi
*/
import java.util.ArrayList;
/*
* sections - protected array list that holds various
* body parts. 
* draw - method to print out the arraylist sections
*/
public abstract class Character{
protected ArrayList<String> sections;
public Character(){
    this.sections = new ArrayList<String>();
    }
public void draw(){
    for (String ss : sections){
        System.out.println(ss);
        }
    }
}