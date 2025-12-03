import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Temperature temp1 = new Temperature();
        System.out.println(temp1.temperatureC);

        Temperature temp2 = new Temperature(23.67);
        System.out.println(temp2.temperatureC);

        System.out.println("Add Temperature to Print");
        Temperature temp3 = new Temperature(userInput.nextDouble());

        temp1.printCelsius();
        temp2.printCelsius();
        temp3.printCelsius();
        System.out.println();

        temp1.printHotOrColdCelcius();
        temp2.printHotOrColdCelcius();
        temp3.printHotOrColdCelcius();
        System.out.println();

        temp1.celciusToFahrenheit();
        temp2.celciusToFahrenheit();
        temp3.celciusToFahrenheit();
        System.out.println();

        temp1.celciusToKelvin();
        temp2.celciusToKelvin();
        temp3.celciusToKelvin();

        double x = 18.32d;
        double y = 273.15d;

        double sum = x+y;
        System.out.println(sum);

        float xx = 18.32f;
        float yy = 273.15f;
        float sumF = xx+yy;
        System.out.println(sumF);
    }

//    https://0.30000000000000004.com/
// Floating Point Math
}