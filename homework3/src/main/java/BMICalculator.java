

import java.util.Scanner;

@SuppressWarnings("ALL")
public class BMICalculator {
    public static void main(String[] args) {

        
        int userInputHeight;
        int userInputWeight;

        //Declare a scanner object to read the command line input by user
        Scanner sn = new Scanner(System.in);

        //loop the utility in loop until the user makes the choice to exit
        while 
        (true) {
            //Print the options for the user to choose from
            System.out.println("BMI calculator  \n");

            System.out.println("Enter your weight in kg:");
            userInputWeight = sn.nextInt();

            System.out.println("Enter your height in cm:");
            userInputHeight = sn.nextInt();

            System.out.printf("Your weight is %s kg%n",userInputWeight );
            System.out.printf("Your height is %.2f m%n",(float)userInputHeight/100);

            System.out.println("--------------------");

            float result = (userInputWeight / (((float)userInputHeight/100) * ((float) userInputHeight/100)));
            String formated = String.format("Your BMI is %.2f \n", result );
            System.out.println(formated );

        }
    }
}
