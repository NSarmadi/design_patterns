/**
 * Written by Neekon Sarmadi.
 */
/**
 * Class mouth extends character decorator.
 * Use super to refer to parent class constructor. 
 * Customize method sets sections array list to appropriate line with appropriate part.
 */
public class Mouth extends CharacterDecorator{
    public Mouth(Character character){
        super(character);
    }   
    public void customize(){
        sections.set(5, "  \\ ---- /");
    }
}