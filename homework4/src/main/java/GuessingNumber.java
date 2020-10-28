
import java.util.Random;
import java.util.Scanner;


public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
 
        
        int  SecretNumber = rng.nextInt (10);
        int userInput;

        
        
            do {
                System.out.println("Choose a number from 0 to 10");
                userInput = scan.nextInt();

                if (userInput != SecretNumber) {
                    System.out.println("You did not detect the number, try again, your number " + userInput);
                 
                   } else {
                    System.out.println("Bingo! you you have the same number " + userInput);
                } 
            }
                while (userInput != SecretNumber); 
                

            }}