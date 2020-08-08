/**
 * This class repeats a pattern: red, yellow, gree, and brown
 * prints out the first 93 lines of this pattern when ran
 * @author Ananya Heroor
 */
public class LessSimplePattern{
    public static void main (String [] args){
        int totalRed= 0;
        int totalYellow=0;
        int totalGreen =0;
        int totalBrown=0;
        for (int i = 1; i<=93; i++){
            if (i%4==0){
                System.out.println(i+ ") brown");
                totalBrown++;
            } else if (i%4==2){
                System.out.println(i+ ") yellow");
                totalYellow++;
            }else if (i%4==3){
                System.out.println(i+ ") green");
                totalGreen++;
            } else if (i%4==1){
                System.out.println(i+ ") red");
                totalRed++;
            }
        }
            System.out.println("total red: " + totalRed);
            System.out.println("total yellow: " + totalYellow);
            System.out.println("total green: " + totalGreen);
            System.out.println("total brown: " + totalBrown);
    }
}