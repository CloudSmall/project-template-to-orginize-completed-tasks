

import java.util.Scanner;

public class WeightOnSolarSystemPlanets {
    public static void main(String[] args) {
        

        final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
        final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
        final double SURFACE_GRAVITY_ON_EARTH = 1.000;
        final double SURFACE_GRAVITY_ON_MOON = 0.1660;
        final double SURFACE_GRAVITY_ON_MARS = 0.3507;
        final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
        final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
        final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
        final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
        final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;

      

        // declare variables that will store the user input
        int userInputPlanet;
        int userInputWeight;

        //Declare a scanner object to read the command line input by user
        Scanner sn = new Scanner(System.in);

        //loop the utility in loop until the user makes the choice to exit
        while (true) {
            //Print the options for the user to choose from
            System.out.println("Enter a solar system planet you want to visit \n");

            System.out.println("*****Available Options*****");
            System.out.println("*. Press 1 for MERCURY, 2 for VENUS, 3 for EARTH, 4 for MOON");
            System.out.println("*. Press 5 for MARS, 6 for JUPITER, 7 for SATURN, 8 for URANUS");
            System.out.println("*. Press 9 for NEPTUNE, 10 for PLUTO, 0 to exit ");


            //Capture the user input in scanner object and store it in a pre decalred variable
            userInputPlanet = sn.nextInt();

            // Prompt the use to make a choice
            System.out.println("Enter your weight:");

            //Capture the user input in scanner object and store it in a pre decalred variable
            userInputWeight = sn.nextInt();


            //Check the user input
            switch (userInputPlanet) {
                case 1:
                    //do choice 1
                    System.out.println("Your weight on MERCURY will be " + userInputWeight * SURFACE_GRAVITY_ON_MERCURY +"\n");
                    break;
                case 2:
                    //do choice 2
                    System.out.println("Your weight on VENUS will be " + userInputWeight * SURFACE_GRAVITY_ON_VENUS +"\n");
                    break;
                case 3:
                    //do choice 3
                    System.out.println("Your weight on EARTH will be " + userInputWeight * SURFACE_GRAVITY_ON_EARTH +"\n");
                    break;
                case 4:
                    //do choice 4
                    System.out.println("Your weight on MOON will be " + userInputWeight * SURFACE_GRAVITY_ON_MOON +"\n");
                    break;
                case 5:
                    //do choice 5
                    System.out.println("Your weight on MARS will be " + userInputWeight * SURFACE_GRAVITY_ON_MARS +"\n");
                    break;
                case 6:
                    //do choice 6
                    System.out.println("Your weight on JUPITER will be " + userInputWeight * SURFACE_GRAVITY_ON_JUPITER +"\n");
                    break;
                case 7:
                    //do choice 7
                    System.out.println("Your weight on SATURN will be " + userInputWeight * SURFACE_GRAVITY_ON_SATURN +"\n");
                    break;
                case 8:
                    //do choice 8
                    System.out.println("Your weight on URANUS will be " + userInputWeight * SURFACE_GRAVITY_ON_URANUS +"\n");
                    break;
                case 9:
                    //do choice 9
                    System.out.println("Your weight on NEPTUNE will be " + userInputWeight * SURFACE_GRAVITY_ON_NEPTUNE +"\n");
                    break;
                case 10:
                    //do choice 10
                    System.out.println("Your weight on PLUTO will be " + userInputWeight * SURFACE_GRAVITY_ON_PLUTO +"\n");
                    break;
                case 0:
                    //exit from the program
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    //inform user in case of invalid choice.
                    System.out.println("Invalid choice. Read the options carefully...");
            }


        }
    }
}
