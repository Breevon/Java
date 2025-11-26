public class Main {
    public static void main(String[] args) {
/* (Turn 1)
        Greeter.sayHi();
        Greeter.sayHi();
*/
/* (Turn 2)
        Greeter obj = new Greeter();
        obj.sayHello();
*/
        Messenger x = new Messenger();
        x.sendMessage();


    }

/* (Turn 1)
    public class Greeter {
        public static void sayHi(){
            System.out.println("Hi there!");
        }
    }
*/
/* (Turn 2)
    static class Greeter {
        public void sayHello() {
            System.out.println("Hello, Java learner!");
        }
    }
*/
    static class Messenger {
        public void sendMessage(){
            System.out.println("Message sent successfully!");
        }
    }



}