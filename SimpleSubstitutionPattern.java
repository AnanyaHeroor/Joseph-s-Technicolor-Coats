/**
 * This class uses the original red/yellow alternating pattern as the “base pattern”, but if a
    number is divisible by 3, put “silver” instead of the color we were supposed to use according to the
    base pattern
 * print the first 121 lines of this pattern
 * @author Ananya Heroor
 */
public class SimpleSubstitutionPattern{
    public static void main (String [] args){
        for (int i = 1; i<=121; i++){
            if (i%3==0){
                System.out.println(i+ ") silver");
            } else if (i%2==0){
                    System.out.println(i+ ") yellow");
                } else{
                    System.out.println(i+ ") red");
                }
        }
    }
}