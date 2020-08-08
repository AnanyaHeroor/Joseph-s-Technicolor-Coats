/**
 * The base pattern is red/yellow/green/brown/olive/chocolate/peach repeating, but...
 * If the number is divisible by 3, then use silver.
 * If the number is divisible by 5, then use gold.
 * If the number is divisible by 15 (i.e., divisible by both 3 and 5) then use ruby.
 * If the number ends in a 1 use violet.
 * If the number ends in a 1 and is divisible by 3, use mauve.
 * If the number ends in a 1 and is divisible by 5, use purple.
 * If the number ends in a 1 and is divisible by 15, use pink.
 * Print first 369 lines of this pattern
 * @author Ananya Heroor
 */
public class SuperSecretSignaturePattern{
    public static void main (String [] args){
        for (int i = 1; i<=369; i++){
            if ((i%3==0) && (i%5==0)){
                System.out.println(i+ ") ruby");
            } else if (i%5==0){
                System.out.println(i+ ") gold");
            } else if ((i%10==1) && (i%3==0)){
                System.out.println(i+") mauve");
            } else if (i%3==0){
                System.out.println(i+") silver");
            } else if (i%10==1){
                System.out.println(i+") violet");
            } else if ((i%10==1) && (i%5==0)){
                System.out.println(i+") purple");
            } else if ((i%10==1) && (i%3==0) && (i%5==0)){
                System.out.println(i+") pink");
            } else if (i%7 == 1){
                System.out.println(i+ ") red");
            } else if (i%7 == 2){
                System.out.println(i+ ") yellow");
            } else if (i%7== 3){
                System.out.println(i+ ") green");
            } else if (i%7== 4){
                System.out.println(i+ ") brown");
            } else if (i%7== 5){
                System.out.println(i+ ") olive");
            } else if (i%7== 6){
                System.out.println(i+ ") chocolate");
            } else if (i%7== 0){
                System.out.println(i+ ") peach");
            } 
        }
    }
}