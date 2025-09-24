
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!



        Scanner userInput = new Scanner(System.in);


        System.out.println("What is your firstname");
        String firstName = userInput.nextLine();

        System.out.println("What is your name?");
        String lastName = userInput.nextLine();

        System.out.println("How old are you?");
        int age = userInput.nextInt();

        System.out.println("On which day were you born? 1-31");
        int day = userInput.nextInt();

        System.out.println("On which month were you born? 1-12");
        int month = userInput.nextInt();

        System.out.println("On which year were you born?");
        int year = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Are you a student?");
        String student = userInput.nextLine();

        System.out.println("Where do you live?");
        String live = userInput.nextLine();

        System.out.println("What is your favourite food?");
        String food = userInput.nextLine();

        System.out.println("Where are you from?");
        String from = userInput.nextLine();
        userInput.nextLine();

        int dayLived = (2025 - year) * 365 + (month - 1) * 30 + day;

        System.out.println("Thank you for your input, " + lastName + " " + firstName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You were born in " + day + "." + month + "." + year );
        System.out.println("Are you a student? " + student);
        System.out.println("You live in " + live);
        System.out.println("Your favourite food is " + food);
        System.out.println("You are from " + from);
        System.out.println("You have lived approximately ~" + dayLived);

        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        System.out.println("Give me random number!");
        float numberOne = userInput.nextFloat();

        System.out.println("Give me an another random number!");
        float numberTwo = userInput.nextFloat();
        userInput.nextLine();

        System.out.println("Addition: " + (numberOne + numberTwo));
        System.out.println("Subtraction: " + (numberOne - numberTwo));
        System.out.println("Division: " + (numberOne / numberTwo));
        System.out.println("Multiplication: " + (numberOne * numberTwo));



        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2

        System.out.println("Give your weight in kg to calculate your BMI.");
        float weight = userInput.nextFloat();

        System.out.println("We need your height too. (in meters!!!)");
        float height = userInput.nextFloat();
        userInput.nextLine();

        float BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);

        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min

        System.out.println("Type in minutes to convert it into hours and remaining minutes.");
        int min = userInput.nextInt();
        int minResult = min % 60;
        int hourResult = min / 60;
        userInput.nextLine();

        System.out.println(hourResult + "h and "+ minResult + "min");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).

        System.out.println("Radius to Circumference converter, add radius.");
        double radius = userInput.nextDouble();
        userInput.nextLine();

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);


        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-

        System.out.println("Type in bill-amount to calculate total price.");
        float billAmount = userInput.nextFloat();

        System.out.println("Type in how percent should be calculated as Tip.");
        float tipPercent = userInput.nextFloat();
        userInput.nextLine();

        float totalPrice = (billAmount * tipPercent / 100) + billAmount;
        System.out.println("Your total amount is " + totalPrice);


        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month

        System.out.println("How much is your hourly wage?");
        int hourlyWage = userInput.nextInt();

        System.out.println("How many hours do you work a week?");
        int hoursWeek = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Your monthly wage is: " + (hourlyWage*hoursWeek*4));
        System.out.println("And your yearly salary is: " + (hourlyWage*hoursWeek*4*12));


        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!

        System.out.println("Lets do a quiz.");
        System.out.println("I will ask you some questions, try to answer them.");

        System.out.println("Question 1");
        System.out.println("What is the full form of 'GG' ?");
        String ggAnswer = userInput.nextLine();

        System.out.println("The answer is 'Good Game'. And you wrote " + ggAnswer + ". If you were correct, write 1, else 0.");
        byte points = userInput.nextByte();

        System.out.println("Question 2");
        System.out.println("What is the name of our planet?");
        userInput.nextLine();
        String planetAnswer = userInput.nextLine();

        System.out.println("The answer is 'Earth'. And you wrote " + planetAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 3");
        System.out.println("Where am I while writing this?");
        userInput.nextLine();
        String locationAnswer = userInput.nextLine();

        System.out.println("The answer is 'Visp'. And you wrote " + locationAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 4");
        System.out.println("How old am I");
        userInput.nextLine();
        String ageAnswer = userInput.nextLine();

        System.out.println("The answer is '17'. And you wrote " + ageAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 5");
        System.out.println("Are you smart?");
        userInput.nextLine();
        String smartAnswer = userInput.nextLine();

        System.out.println("The answer is 'no'. And you wrote " + smartAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 6");
        System.out.println("Does your friend know that you are dumb?");
        userInput.nextLine();
        String dumbAnswer = userInput.nextLine();

        System.out.println("The answer is 'I am not dumb'. And you wrote " + dumbAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 7");
        System.out.println("Is Switzerland in EU?");
        userInput.nextLine();
        String euAnswer = userInput.nextLine();

        System.out.println("The answer is 'No'. And you wrote " + euAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 8");
        System.out.println("In what galaxy is our solar system located?");
        userInput.nextLine();
        String galaxyAnswer = userInput.nextLine();

        System.out.println("The answer is 'Milky Way Galaxy'. And you wrote " + galaxyAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 9");
        System.out.println("What is capital of France?");
        userInput.nextLine();
        String capitalAnswer = userInput.nextLine();

        System.out.println("The answer is 'Paris'. And you wrote " + capitalAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Question 10");
        System.out.println("What is the largest mammal in the world?");
        userInput.nextLine();
        String mammalAnswer = userInput.nextLine();

        System.out.println("The answer is 'Whale'. And you wrote " + mammalAnswer + ". If you were correct, write 1, else 0.");
        points += userInput.nextByte();

        System.out.println("Now im calculating your points....");
        System.out.println(" If you were honest, then you reached a total of " + points + " points! Congrats!");

        System.out.println("Bye...");

        userInput.close();






        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);