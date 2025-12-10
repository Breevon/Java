import comberufsfachschule.temperature.Temperature;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Temperature temp1 = new Temperature(-5.37);
        temp1.printCelsius();
        System.out.println(temp1.temperatureC);


        //Number 6
        //Error because the object temp1 which is connected to the konstraktor Temperature cant be accessed anymore. (Private)

        System.out.println(temp1.getCelsiusToFahrenheit());
        System.out.println(temp1.getCelsiusToKelvin());

        Temperature tempDefault = new Temperature();
        System.out.println(tempDefault.getCelsiusToFahrenheit());
        System.out.println(tempDefault.getCelsiusToKelvin());
    }
}