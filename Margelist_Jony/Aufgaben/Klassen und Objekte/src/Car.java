public class Car {
    byte doorsAmount = 2;
    byte seatsAmount = 2;

    boolean isSportCar = true;
    boolean isNew = true;

    String color = "black";
    String brand = "default car";

    short maxSpeed = 265;

    public Car() {
        System.out.println("heyo i  have been created yuhu");
    }

    public Car(String brand) {
        this.brand = brand;

    }

    public void honk() {
        System.out.println("honkie");
    }


    public void honk(String honk) {
        System.out.println(honk);
    }

//     public Car(String brand, String color) {
//         this.brand = brand;
//         this.color = color;
//     }
}