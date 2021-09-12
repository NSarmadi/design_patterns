/**
* Written by Neekon Sarmadi
*/
/**
* Class extends CharacterDecorator abstract class.
* Use super to refer to parent class constructor. 
* Customize method sets sections array list to appropriate line with appropriate part.
*/
public class Eyes extends CharacterDecorator{
    public Eyes(Character character){
        super(character);
    }
    public void customize(){
        sections.set(3," |  o  o  |");
    }
}