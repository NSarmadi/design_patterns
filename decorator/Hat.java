/**
 * Written by Neekon Sarmadi
 */
/**
 * Class extends character decorator
 * Use super to refer to parent class constructor. 
 * Customize method sets sections array list to appropriate line with appropriate part.
 */
public class Hat extends CharacterDecorator{ 
    public Hat(Character character){
    super(character);    
}
public void customize(){
    sections.set(0,"    ____     ");
    sections.set(1," __|____|____");
    }
}