import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

        //Old
        System.out.println("Give in a random number between 1-7.");
        byte userNumber = userInput.nextByte();
        switch  (userNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday");
                break;

        }

        //new
        switch (userNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a Weekday");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

        //Old
        System.out.println("Give in a random Month.");
        String userMonth = userInput.nextLine();

        //Old
        switch (userMonth) {
            case "November":
            case "December":
            case "January":
                System.out.println("Winter");
                break;
            case "February":
            case "March":
            case "April":
                System.out.println("Spring");
                break;
            case "May":
            case "June":
            case "July":
                System.out.println("Summer");
                break;
            case "August":
            case "September":
            case "October":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not a month");
                break;
        }

        //New

        switch (userMonth) {
            case "November","December", "January" -> System.out.println("Winter");
            case "February", "March", "April" -> System.out.println("Spring");
            case "May", "June", "July" -> System.out.println("Summer");
            case "August", "September", "October" -> System.out.println("Autumn");
            default -> System.out.println("Not a month");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.

        System.out.println("Give an random month number.");
        byte userMonthNumber = userInput.nextByte();

        //Old
        switch (userMonthNumber) {
            case 2:
                System.out.println("28 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Not a Month number");
        }

        //new
        switch (userMonthNumber) {
            case 2 -> System.out.println("28 days");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("Not a month number");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}