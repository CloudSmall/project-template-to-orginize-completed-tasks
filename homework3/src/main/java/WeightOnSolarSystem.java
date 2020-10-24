

import java.util.Scanner;

public class WeightOnSolarSystem {

    public static void Calculate(int userInputWeight, double planetGravity, String planetName) {
        double result = userInputWeight * planetGravity;
        System.out.printf("Your weight on planet %s is %.2f \n %n", planetName, result);
    }

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
        try (Scanner sn = new Scanner(System.in)) {

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
    
    
                /*if (userInputPlanet == 1) {
                    System.out.println("Your weight on MERCURY will be " + userInputWeight * SURFACE_GRAVITY_ON_MERCURY + "\n");*/
    
                    /*Double a = (userInputWeight * SURFACE_GRAVITY_ON_MERCURY );
                    System.out.println( String.format("Your weight on MERCURY will be %.2f \n",a ));*/

                if (userInputPlanet == 1) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_MERCURY, "MERCURY");

                } else if (userInputPlanet == 2) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_VENUS, "VENUS");
                } else if (userInputPlanet == 3) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_EARTH, "EARTH");
                } else if (userInputPlanet == 4) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_MOON, "MOON");

                } else if (userInputPlanet == 5) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_MARS, "MARS");
                } else if (userInputPlanet == 6) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_JUPITER, "JUPITER");
                } else if (userInputPlanet == 7) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_SATURN, "SATURN");
                } else if (userInputPlanet == 8) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_URANUS, "URANUS");
                } else if (userInputPlanet == 9) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_NEPTUNE, "NEPTUNE");
                } else if (userInputPlanet == 10) {
                    Calculate(userInputWeight, SURFACE_GRAVITY_ON_PLUTO, "PLUTO");
                } else if (userInputPlanet == 0) {
                    System.out.println("Exiting...");
                    System.exit(0);

                } else {
                    System.out.println("Invalid choice. Read the options carefully...");
                }
            }
        }
    }
}

