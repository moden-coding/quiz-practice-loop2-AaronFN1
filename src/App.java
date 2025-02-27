/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter -1 to quit.");
        int highestScore = -1000;
        int lowestScore = 1000;
        while (true){
            System.out.println("Test Score?");
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1){
                highestScore = 0;
                lowestScore = 0;
                break;
            }
            if (score > highestScore){
                highestScore = score;
            }
            if (score < lowestScore){
                lowestScore = score;
            }
        }
        System.out.println("The highest score was "+highestScore+".");
        System.out.println("The lowest score was "+lowestScore+".");
    }  
}
