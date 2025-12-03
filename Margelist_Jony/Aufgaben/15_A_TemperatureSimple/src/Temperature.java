public class Temperature {
    double temperatureC = 18.32;

    public Temperature(){

    }

    public Temperature(double temperatureC) {
        this.temperatureC = temperatureC;
    }

    public void printCelsius(){
        System.out.println(temperatureC + "° Celsius");
    }

    public void printHotOrColdCelcius(){
        if (temperatureC > 24){
            System.out.println("It’s hot: " + temperatureC + "° Celsius!");
        } else {
            System.out.println("It’s freezing: " + temperatureC + "° Celsius!");
        }
    }

    public void celciusToFahrenheit(){
        double temperatureF = (temperatureC * 9/5) + 32;
        System.out.println(temperatureF);
    }

    public void celciusToKelvin(){
        double temperatureK = temperatureC + 273.15;
        System.out.println(temperatureK);
    }
}


