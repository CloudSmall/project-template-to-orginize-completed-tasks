
import java.util.Scanner;



public class TypesOfWeekDays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a day of week: ");

        String WeekDay = input.next();



        switch (WeekDay) {
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println( WeekDay + " Working day");
                break;
            case "Saturday":

            case "Sunday":
                System.out.println( WeekDay + " Weekend day");
                break;
            default:
                //inform user in case of invalid choice.
                System.out.println("Invalid choice. Read the options carefully...");
        }


    }
}

