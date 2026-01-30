public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static int Singleton getInstance(){
        if (instance == null){

        }
        return instance;
    }
}
