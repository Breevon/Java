public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:


        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here
        byte myByte = 1;
        short myShort = 2;
        char myChar= 7;
        int myInt = 3;
        long myLong= 4;
        float myFloat= 5;
        double myDouble= 6;

        myByte = (byte) myShort;
        myByte = (byte) myChar;
        myByte = (byte) myInt;
        myByte = (byte) myLong;
        myByte = (byte) myFloat;
        myByte = (byte) myDouble;

        myShort = myByte;
        myShort = (short) myChar;
        myShort = (short) myInt;
        myShort = (short) myLong;
        myShort = (short) myFloat;
        myShort = (short) myDouble;

        myChar = (char) myByte;
        myChar = (char) myShort;
        myChar = (char) myInt;
        myChar = (char) myLong;
        myChar = (char) myFloat;
        myChar = (char) myDouble;

        myInt = myByte;
        myInt = myShort;
        myInt = myChar;
        myInt = (int) myLong;
        myInt = (int) myFloat;
        myInt = (int) myDouble;

        myLong = myByte;
        myLong = myShort;
        myLong = myChar;
        myLong = myInt;
        myLong = (long) myFloat;
        myLong = (long) myDouble;

        myFloat = myByte;
        myFloat = myShort;
        myFloat = myChar;
        myFloat = myInt;
        myFloat = myLong;
        myFloat = (float) myDouble;

        myDouble = myByte;
        myDouble = myShort;
        myDouble = myChar;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = myFloat;

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myLong);
        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(myShort);
        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here
        long myLongZwei = 1234567890L;
        int myIntZwei = (int) myLongZwei;

        System.out.println(myIntZwei);



        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // Guess= 3310
        // Test= 3310

        // Can you explain what is happening?
        // String is just considering Number as Characters not as value so "33"+10= 3310.

        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        //String houseNumberInString = "52";
        //int houseNumber = houseNumberInString;
        // System.out.println(houseNumber);

        String houseNumberInString  = "52";
        int houseNumber = Integer.valueOf(houseNumberInString);
        System.out.println(houseNumber);
        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here
        // only allowed when the string is a Number

    }
}