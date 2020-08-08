/**
 * The base pattern is red/yellow/green/brown repeating, as in part (1b), but...
 * If the number is divisible by 3, then use silver.
 * If the number is divisible by 5, then use gold.
 * If the number is divisible by 15 (i.e., divisible by both 3 and 5) then use ruby
 * print first 251 lines of this pattern
 * @author Ananya Heroor
 */
public class FancySubstitutionPattern{
    public static void main (String[] args){
        for (int i =1; i<=251; i++){
            if ((i%3==0) && (i%5==0)){
                System.out.println(i+ ") ruby");
            } else if (i%5 == 0){
                System.out.println(i+ ") gold");
            } else if (i%3 == 0){
                System.out.println(i+ ") silver");
            }
            else if (i%4==0){
                System.out.println(i+ ") brown");
            } else if (i%4==2){
                System.out.println(i+ ") yellow");
            } else if (i%4==3){
                System.out.println(i+ ") green");
            } else if (i%4==1){
                System.out.println(i+ ") red");
            }
        }
    }
}