public class Mainx {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.

        int leapYear100;
        int leapYear400;
        for (int todayYearCounter=0; todayYearCounter <= 2025; todayYearCounter+=4) {

            leapYear100 = todayYearCounter%100;
            leapYear400 = todayYearCounter%400;

            if (leapYear100==0) {

                    if (leapYear400==0){
                        System.out.println(todayYearCounter);
                    } else {

                    }

            } else {
                System.out.println(todayYearCounter);
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".

        for (int numberCounter=1 ; numberCounter <= 10; numberCounter+=1) {

            int divisible3 = numberCounter%3;
            int divisible5 = numberCounter%5;

            if (divisible3==0 && divisible5==0){
                System.out.println("FizzBuzz");
            } else if (divisible3==0) {
                System.out.println("Fizz");
            } else if (divisible5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numberCounter);
            }
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 121; // change this value from prime to not prime to test
        // Your code here
         boolean isPrime = true;
         for (int counter = 2; counter < n; counter++) {
             if (n % counter == 0) {
                 isPrime=false;
                 break;
             }
         }
         if(isPrime) {
             System.out.println(n + " ist eine prime");
         } else {
             System.out.println(n + " ist keine prime");
         }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.

        for (int counter = 2; counter <= 100; counter++){
            int checker = 2;
            while (checker <= counter) {
                if (counter%checker == 0){
                    if (counter == checker) {
                        System.out.println(counter);
                    } else {
                        break;
                    }
                }
                checker++;
            }
        }


    }
}