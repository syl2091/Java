package lambda;

public class Lambda2 {
    static String salutation = "Hello! ";

    public static void main(String args[]) {
        int n = 0;
        Lambda1.GreetingService greetService1 =
                message -> {
                    System.out.println(salutation + message+n);
                };
        greetService1.sayMessage("Runoob");
    }
    interface GreetingService {
        void sayMessage(String message);
    }

}
