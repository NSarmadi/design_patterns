/** 
* Written by Neekon Sarmadi
*/
/** 
* Class extends abstract class Character
* Character is the character being decorated.
* Call a for loop for to take strings from sections array and put them in "this".
* Call abstract method customize.
*/
public abstract class CharacterDecorator extends Character{
protected Character character;
public CharacterDecorator(Character character){
    this.character = character;
 for(String c : character.sections){
     this.sections.add(c);
    }
    customize();
    }    
    public abstract void customize();
}