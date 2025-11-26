public class Car {
     byte doorsAmount = 2;
     byte seatsAmount = 2;

     boolean isSportCar = true;
     boolean isNew = true;

     String color = "black";
     String brand = "default car";

     short maxSpeed = 265;

     public Car(){}

//     public Car(String brand) {
//         this.brand = brand;
//     }

     public Car(String brand, String color) {
         this.brand = brand;
         this.color = color;
     }
}