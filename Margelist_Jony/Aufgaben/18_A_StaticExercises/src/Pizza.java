public class Pizza {

    //Variables
    //Task 10
    int radius;
    int color;
    String ingredients;

    //Task 12
    static int amountOfPizzaCreated;
    // Static because, when we are creating new Objects, every one of them gets new values for themselves, but by using
    // static every one of them as one place to collect the value.


    // Constructors
    //Task 12
    public Pizza(){
        amountOfPizzaCreated++;
    }


    //Methods
    //Task 10
    public void Infos(){
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Ingredients: " + ingredients);
    }

    //Task 12
    public void getCookedPizza(){
        System.out.println(amountOfPizzaCreated);
    }

}
