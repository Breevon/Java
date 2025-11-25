public class Main {
    public static void main(String[] args) {

        String mynumber = "9876";

        Short.parseShort("5");
        short no1 = Short.parseShort(mynumber.substring(0,1));
        short no2 = Short.parseShort(mynumber.substring(1,2));
        short no3 = Short.parseShort(mynumber.substring(2,3));
        short no4 = Short.parseShort(mynumber.substring(3,4));

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
        System.out.println(no4);
    }
}