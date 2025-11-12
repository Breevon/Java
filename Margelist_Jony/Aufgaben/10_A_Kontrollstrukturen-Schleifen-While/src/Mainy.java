import java.util.Random;

public class Mainy {
    public static void main(String[] args) {


        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      Answer: Spam= "iteratorEx1:0 "

        //      2. Why does this behavior occur?
        //      Because the variable isnt changing

        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        //      Add iteratorEx1++; after System out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      And change "iteratorEx1:" in sout to "i:"


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100

        int no1 = 0;

        while (no1 <= 100) {
            System.out.println(no1);
            no1++;
        }

        //      02-02. 42 to 100
        no1 = 42;
        while (no1 <= 100) {
            System.out.println(no1);
            no1++;
        }

        //      02-03. 42 to 123
        no1 = 42;
        while (no1 <= 123) {
            System.out.println(no1);
            no1++;
        }

        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        no1 = 0;
        while (no1<=10) {
            System.out.println(no1);
            no1 = no1+2;
        }

        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        no1 = 1;
        while (no1<=10) {
            System.out.println(no1);
            no1 = no1 + 2;
        }

        //      02-06. -10 to 20
        no1 = -10;
        while (no1<=20) {
            System.out.println(no1);
            no1++;
        }

        //      02-07. 35 to 0 (descending)
        no1 = 35;
        while (no1>=0) {
            System.out.println(no1);
            no1--;
        }

        //      02-08. 15 to -20 (descending)
        no1 = 15;
        while (no1>=-20) {
            System.out.println(no1);
            no1--;
        }

        //      02-09. Even numbers from 10 to -10 (descending)
        no1 = 10;
        while (no1>=-10) {
            System.out.println(no1);
            no1 = no1-2;
        }

        //      02-10. Odd numbers from 10 to -10 (descending)
        no1 = 9;
        while (no1>=-10) {
            System.out.println(no1);
            no1 = no1-2;
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;

        // Your code here
        no1 = 0;
        while (no1<=100) {
            whileSum_03 += no1;
            no1++;
        }

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;

        // Your code here
        no1 = 0;
        while (no1 <= 100) {
            whileSum_04 += no1;
            no1 += 2;
        }

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;

        // Your code here
        no1 = 1;
        while (no1<=100) {
            whileSum_05 += no1;
            no1 += 2;
        }

        System.out.println(whileSum_05); // Should be 2500

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;

        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here
        while (!(randomNumber==22)) {
            iterationSteps++;
            randomNumber=randomGenerator.nextInt(101);
        }

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}