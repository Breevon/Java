
public class Main {
    public static void main(String[] args) {

        NamesArray namesArray = new NamesArray();
        namesArray.printValueAtIndex5();
        System.out.println();

        namesArray.printMyName();
        System.out.println();

        namesArray.printArrayLength();
        System.out.println();

        namesArray.loopThroughArray();
        System.out.println();

        namesArray.foreachLoopThroughArray();
        System.out.println();

        namesArray.printArrayValuesFromTo(2,8);
        System.out.println();

        namesArray.printArrayValuesFromTo(4,6);
        System.out.println();

        namesArray.printArrayValuesFromTo(8,2);
        System.out.println();

        namesArray.printArrayValuesFromTo(4,4);


        NumbersArray numbersArray = new NumbersArray();
        System.out.println(numbersArray.calculateArraySum());
        System.out.println();

        System.out.println(numbersArray.calculateArraySumOfNegativeNumbers());
        System.out.println();

        System.out.println(numbersArray.calculateArraySumOfPositiveNumbers());
    }
}