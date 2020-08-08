/**
 * This class prints out 71 lines of a pattern when run
 * every even number is yellow and every odd number is red
 * @author Ananya Heroor
 */
public class VerySimplePattern{
    public static void main (String [] args){
        
        for (int i = 1; i<=71; i++){
            if (i % 2 == 0){
                System.out.println(i+ ") yellow"); //every even number is yellow
            } else {
                System.out.println(i+ ") red"); //every odd number is red
            }
        }
    }
}