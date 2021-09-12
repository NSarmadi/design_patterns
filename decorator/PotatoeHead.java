/**
*Written by Neekon Sarmadi
*/
/**
* Constructor to add the appropriate strings to sections.
*/
public class PotatoeHead extends Character{
    public PotatoeHead(){
        for( int i = 0 ; i < 7 ; i++ ){
            if (i == 0){
                sections.add("");
            }
            if (i == 1){
                sections.add("  ___  ");
            }
            if (i == 2){
                sections.add("  /      \\");
            }
            if (i == 3){
                sections.add(" |        |");
            }
            if (i == 4){
                sections.add(" |        |");
            }
            if (i == 5){
                sections.add("  \\      /");

            }
            if (i == 6){
                sections.add("   \\____/");
            }
        }
    }
}