
public class Main {
    public static void main(String[] args) {
/*
        Car myFirstCar = new Car();
        System.out.println(myFirstCar.brand);

        Car audi = new Car();
        audi.brand = "audi";

        Car ferrari = new Car();
        ferrari.brand = "ferrari";

        Car vw = new Car();
        vw.brand = "vm";

        System.out.println(vw.brand);
*/
// Oder
/*
        Car myFirstCar = new Car();
        System.out.println(myFirstCar.brand);

        Car nissan = new Car("nissan");
        Car ferrari = new Car("ferrari");
        Car volvo = new Car("volvo");

        System.out.println(nissan.brand);
*/

        Car nissan = new Car("nissan", "black");
        Car ferrari = new Car("ferrari", "blue");
        Car volvo = new Car("volvo", "red");

        System.out.println(nissan.brand);


    }
}