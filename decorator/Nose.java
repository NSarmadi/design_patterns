/**
*Written by Neekon Sarmadi 
*/
/**
 * Class nose extends character decorator.
 * Use super to refer to parent class constructor. 
 * Customize method sets sections array list to appropriate line with appropriate part.
 */
public class Nose extends CharacterDecorator{
public Nose(Character character){
    super(character);
    }
public void customize(){ 
    sections.set(4," |   >    |");
    }
}